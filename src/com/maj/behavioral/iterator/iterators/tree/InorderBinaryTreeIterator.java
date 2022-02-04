package com.maj.behavioral.iterator.iterators.tree;

import com.maj.behavioral.iterator.collections.tree.BinaryNode;
import com.maj.behavioral.iterator.collections.tree.BinaryTree;
import com.maj.behavioral.iterator.collections.tree.Node;

/**
 * Itérateur de parcours "Inorder", on parcourt d'abord le sous-arbre gauche, puis la racine, puis le sous-arbre droit
 * @param <T> Type des données encapsulées dans les noeuds de l'arbre.
 */
public class InorderBinaryTreeIterator<T> extends DepthFirstBinaryTreeIterator<T> {

    public InorderBinaryTreeIterator(BinaryTree<T> tree) {
        super(tree);
        while (current.getLeft() != null) {
            current = current.getLeft();
            nodes.push(current);
        }
    }

    /**
     * -----1-----
     * ---2   3----
     * -4  5-6 7-
     * -> 4 2 5 1 6 3 7
     */
    @Override
    public Node<T> getNext() {
        if (!hasMore())
            return null;

        current = nodes.pop();

        BinaryNode<T> right = current.getRight();
        if (right != null) {
            nodes.push(right);
            BinaryNode<T> left = right.getLeft();
            while (left != null) {
                nodes.push(left);
                left = left.getLeft();
            }
        }

        return current;
    }
}
