package com.maj.behavioral.iterator.collections;

import com.maj.behavioral.iterator.iterators.CircularLinkedListIterator;
import com.maj.behavioral.iterator.iterators.Iterator;
import com.maj.behavioral.iterator.iterators.TwoWayIterator;

import java.util.List;

/**
 * Un pont qui agit sur une liste et comporte la ou les méthodes permettant de créer
 * des itérateurs pour cette liste sous-jacente.
 * @param <T>
 */
public class LinkedList<T>{
    private final List<T> elements;

    public LinkedList(List<T> elements) {
        this.elements = elements;
    }

    public TwoWayIterator<T> createCircularIterator() {
        return new CircularLinkedListIterator<>(this);
    }

    public int size() {
        return this.elements.size();
    }

    public T get(int index) {
        return this.elements.get(index);
    }
}
