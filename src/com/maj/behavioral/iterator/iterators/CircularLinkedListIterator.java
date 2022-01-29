package com.maj.behavioral.iterator.iterators;

import com.maj.behavioral.iterator.collections.LinkedList;
import com.sun.source.tree.Tree;

public class CircularLinkedListIterator<T> implements TwoWayIterator<T> {
    private final LinkedList<T> linkedList;
    private int currentIndex = 0;

    public CircularLinkedListIterator(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public T getCurrent() {
        return linkedList.get(currentIndex);
    }

    @Override
    public T getNext() {
        currentIndex = Math.floorMod(currentIndex + 1, linkedList.size());
        return getCurrent();
    }

    @Override
    public T getPrevious() {
        currentIndex = Math.floorMod(currentIndex - 1, linkedList.size());
        return getCurrent();
    }

    @Override
    public boolean hasMore() {
        return true;
    }
}
