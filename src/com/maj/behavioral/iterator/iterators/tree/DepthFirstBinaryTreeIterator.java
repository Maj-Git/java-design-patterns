package com.maj.behavioral.iterator.iterators.tree;

import com.maj.behavioral.iterator.collections.tree.BinaryNode;
import com.maj.behavioral.iterator.collections.tree.BinaryTree;
import com.maj.behavioral.iterator.collections.tree.Node;
import com.maj.behavioral.iterator.iterators.Iterator;

import java.util.Stack;

/**
 * Itérateur abstrait de parcours en profondeur d'un arbre binaire.
 * @param <T> Type des données encapsulées dsans les noeuds de l'arbre.
 */
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
