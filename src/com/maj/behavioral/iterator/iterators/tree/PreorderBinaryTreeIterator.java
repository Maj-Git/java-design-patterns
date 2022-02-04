package com.maj.behavioral.iterator.iterators.tree;

import com.maj.behavioral.iterator.collections.tree.BinaryNode;
import com.maj.behavioral.iterator.collections.tree.BinaryTree;

/**
 * Itérateur de parcours "Preorder", on parcourt d'abord la racine, puis le sous-arbre gauche, puis le sous-arbre droit, p.
 * @param <T> Type des données encapsulées dans les noeuds de l'arbre.
 */
public class PreorderBinaryTreeIterator<T> extends DepthFirstBinaryTreeIterator<T> {
    public PreorderBinaryTreeIterator(BinaryTree<T> tree) {
        super(tree);
    }

    /**
     * -----1-----
     * ---2   3----
     * -4  5-6 7
     * -> 1 2 4 5 3 6 7
     */
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
