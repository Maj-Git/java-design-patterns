package com.maj.behavioral.iterator.collections.tree;

import com.maj.behavioral.iterator.iterators.tree.InorderBinaryTreeIterator;
import com.maj.behavioral.iterator.iterators.tree.PostorderBinaryTreeIterator;
import com.maj.behavioral.iterator.iterators.tree.PreorderBinaryTreeIterator;
import com.maj.behavioral.iterator.iterators.Iterator;

/**
 * Un arbre binaire qui comporte un noeud binaire de départ (la racine) qui permet de décrire l'arborescence,
 * et des méthodes qui permettent de créer différents types d'itérateurs selon la manière dont on veut parcourir l'arbre.
 *
 * Cela permet d'encapsuler les comportements d'itération dans des classes séparées dont l'unique fonction sera l'itération
 * sur la collection.
 * @param <T> Le type de données porté par les noeuds binaires.
 */
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
