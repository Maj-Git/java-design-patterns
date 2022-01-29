package com.maj.behavioral.iterator.iterators;

import com.maj.behavioral.iterator.collections.tree.BinaryNode;
import com.maj.behavioral.iterator.collections.tree.BinaryTree;

public class PreorderBinaryTreeIterator<T> extends DepthFirstBinaryTreeIterator<T> {
    public PreorderBinaryTreeIterator(BinaryTree<T> tree) {
        super(tree);
    }
    @Override
    public BinaryNode<T> getNext() {
        if (!hasMore())
            return null;

        current = nodes.pop();

        BinaryNode<T> right = current.getRight();
        BinaryNode<T> left = current.getLeft();

        if (right != null) {
            nodes.push(right);
        }

        if (left != null) {
            nodes.push(left);
        }

        return current;
    }
}
