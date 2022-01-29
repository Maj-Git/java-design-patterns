package com.maj.behavioral.iterator.iterators;

import com.maj.behavioral.iterator.collections.tree.BinaryNode;
import com.maj.behavioral.iterator.collections.tree.BinaryTree;
import com.maj.behavioral.iterator.collections.tree.Node;

public class PostorderBinaryTreeIterator<T> extends DepthFirstBinaryTreeIterator<T> {
    public PostorderBinaryTreeIterator(BinaryTree<T> tree) {
        super(tree);

        pushChildrenNodes(current);
    }

    /**
     * -----1-----
     * ---2   3----
     * -4  5-6 7
     * -> 4 5 6 7 2 3 1
     */
    @Override
    public Node<T> getNext() {
        if (!hasMore())
            return null;

        current = nodes.pop();
        return current;
    }

    private void pushChildrenNodes(BinaryNode<T> root) {
        var left = root.getLeft();
        var right = root.getRight();

        if (right != null) {
            nodes.push(right);
        }

        if (left != null) {
            nodes.push(left);
        }

        if (right != null) {
            pushChildrenNodes(right);
        }

        if (left != null) {
            pushChildrenNodes(left);
        }
    }
}
