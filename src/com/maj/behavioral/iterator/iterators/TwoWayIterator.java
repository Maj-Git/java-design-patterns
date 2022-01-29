package com.maj.behavioral.iterator.iterators;

public interface TwoWayIterator<T> extends Iterator<T> {
    T getPrevious();
}
