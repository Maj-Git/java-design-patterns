package com.maj.behavioral.iterator.iterators;

public interface Iterator<T> {
    T getCurrent();
    T getNext();
    boolean hasMore();
}
