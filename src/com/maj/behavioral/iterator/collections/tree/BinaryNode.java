package com.maj.behavioral.iterator.collections.tree;

/**
 * Un noeud binaire qui peut être une feuille (sans enfants, left et right sont null),
 * ou un noeud avec au moins un descendant.
 * @param <T>
 */
public class BinaryNode<T> extends Node<T> {
    private final BinaryNode<T> left;
    private final BinaryNode<T> right;

    public BinaryNode(T value, BinaryNode<T> left, BinaryNode<T> right) {
        super(value);
        this.left = left;
        this.right = right;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }
}
