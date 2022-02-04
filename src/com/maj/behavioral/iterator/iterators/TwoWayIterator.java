package com.maj.behavioral.iterator.iterators;

/**
 * Un itérateur qui permet également d'itérer en sens inverse.
 * @param <T> Le type des objets de la collection sur laquelle on itère.
 */
public interface TwoWayIterator<T> extends Iterator<T> {
    T getPrevious();
}
