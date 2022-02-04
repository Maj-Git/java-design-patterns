package com.maj.behavioral.iterator.collections.tree;

/**
 * Classe abstraite pour un noeud qui porte une donnée de type T.
 * @param <T> Type de la donnée portée par le noeud.
 */
public abstract class Node<T> {
    private final T value;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
