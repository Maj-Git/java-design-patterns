package com.maj.behavioral.iterator.collections.tree;

public abstract class Node<T> {
    private final T value;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
