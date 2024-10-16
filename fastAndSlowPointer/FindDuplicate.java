package fastAndSlowPointer;

/*
Problem Statement: Given an array of integers where each integer is between 1 and n, where n is the size of the array,
find the duplicate number.

Approach:
Use the fast and slow pointer technique to detect a cycle, similar to the cycle detection problem in a linked list.
Treat the array indices as linked list nodes, and the values in the array point to the next index.
 */
public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));  // Output: 2
    }
}
