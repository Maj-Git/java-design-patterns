package com.maj.behavioral.iterator.iterators;

import com.maj.behavioral.iterator.collections.tree.BinaryNode;
import com.maj.behavioral.iterator.collections.tree.BinaryTree;
import com.maj.behavioral.iterator.collections.tree.Node;

import java.util.Stack;

public abstract class DepthFirstBinaryTreeIterator<T> implements Iterator<Node<T>> {
    protected final Stack<BinaryNode<T>> nodes = new Stack<>();
    protected BinaryNode<T> current;

    public DepthFirstBinaryTreeIterator(BinaryTree<T> tree) {
        current = tree.getRoot();
        nodes.push(current);
    }

    @Override
    public Node<T> getCurrent() {
        return current;
    }

    @Override
    public boolean hasMore() {
        return !nodes.isEmpty();
    }
}
