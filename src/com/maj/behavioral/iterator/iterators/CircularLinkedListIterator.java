package com.maj.behavioral.iterator.iterators;

import com.maj.behavioral.iterator.collections.LinkedList;
import com.sun.source.tree.Tree;

/**
 * Un itérateur qui permet de parcourir une liste chaînée comme si elle était circulaire.
 *
 * Pour une liste indexée depuis 0 de taille N, l'élément suivant de l'élément à l'index N-1 sera celui à l'index 0,
 * et celui précédent l'élément à l'index 0 sera celui à l'index N-1.
 * @param <T> Le type des objets de la liste.
 */
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
