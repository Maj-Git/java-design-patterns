package com.maj.behavioral.iterator.collections.tree;

import com.maj.behavioral.iterator.iterators.InorderBinaryTreeIterator;
import com.maj.behavioral.iterator.iterators.PostorderBinaryTreeIterator;
import com.maj.behavioral.iterator.iterators.PreorderBinaryTreeIterator;
import com.maj.behavioral.iterator.iterators.Iterator;

public class BinaryTree<T> {
    private final BinaryNode<T> root;

    public BinaryTree(BinaryNode<T> root) {
        this.root = root;
    }

    public Iterator<Node<T>> createPreorderIterator() {
        return new PreorderBinaryTreeIterator<>(this);
    }

    public Iterator<Node<T>> createInorderIterator() {
        return new InorderBinaryTreeIterator<>(this);
    }

    public Iterator<Node<T>> createPostorderIterator() {
        return new PostorderBinaryTreeIterator<>(this);
    }

    public BinaryNode<T> getRoot() {
        return root;
    }
}
