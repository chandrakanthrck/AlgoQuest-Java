package walmart;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        if (iterator.hasNext()) {
            nextElement = iterator.next();
        }
    }

    public Integer peek() {
        return nextElement;
    }

    @Override
    public Integer next() {
        Integer returnValue = nextElement;
        nextElement = iterator.hasNext() ? iterator.next() : null;
        return returnValue;
    }

    @Override
    public boolean hasNext() {
        return nextElement != null;
    }
}

