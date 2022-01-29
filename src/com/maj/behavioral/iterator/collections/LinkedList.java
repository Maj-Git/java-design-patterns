package com.maj.behavioral.iterator.collections;

import com.maj.behavioral.iterator.iterators.CircularLinkedListIterator;
import com.maj.behavioral.iterator.iterators.Iterator;

import java.util.List;

public class LinkedList<T>{
    private final List<T> elements;

    public LinkedList(List<T> elements) {
        this.elements = elements;
    }

    public Iterator<T> createCircularIterator() {
        return new CircularLinkedListIterator<>(this);
    }

    public int size() {
        return this.elements.size();
    }

    public T get(int index) {
        return this.elements.get(index);
    }
}
