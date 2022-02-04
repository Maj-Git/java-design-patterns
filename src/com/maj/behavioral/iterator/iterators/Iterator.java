package com.maj.behavioral.iterator.iterators;

/**
 * Interface pour un itérateur sur une collection d'objets de type T.
 * @param <T> Le type des objets de la collection sur laquelle on itère.
 */
public interface Iterator<T> {
    T getCurrent();
    T getNext();
    boolean hasMore();
}
