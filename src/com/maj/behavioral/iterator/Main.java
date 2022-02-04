package com.maj.behavioral.iterator;

import com.maj.behavioral.iterator.collections.LinkedList;
import com.maj.behavioral.iterator.collections.tree.BinaryNode;
import com.maj.behavioral.iterator.collections.tree.BinaryTree;
import com.maj.behavioral.iterator.collections.tree.Node;
import com.maj.behavioral.iterator.iterators.Iterator;
import com.maj.behavioral.iterator.iterators.TwoWayIterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        circularLinkedListExample();

        System.out.println("-----------");

        binaryTreeExample();
    }

    /**
     * On crée une liste chainée et un itérateur circulaire pour cette liste,
     * qu'on va alors utiliser pour parcourir la liste.
     */
    private static void circularLinkedListExample() {
        List<Integer> numbers = List.of(0, 1, 2, 3, 4);
        LinkedList<Integer> linkedNumbers = new LinkedList<>(numbers);
        TwoWayIterator<Integer> circularIterator = linkedNumbers.createCircularIterator();

        System.out.println(circularIterator.getCurrent());
        System.out.println(circularIterator.getNext());
        System.out.println(circularIterator.getNext());
        System.out.println(circularIterator.getNext());
        System.out.println(circularIterator.getNext());
        System.out.println(circularIterator.getNext());
        System.out.println(circularIterator.getNext());
        System.out.println(circularIterator.getPrevious());
        System.out.println(circularIterator.getPrevious());
        System.out.println(circularIterator.getPrevious());
        System.out.println(circularIterator.getPrevious());
    }

    /**
     * On crée un arbre binaire, et différents itérateurs dont on se sert pour parcourir l'arbre.
     */
    private static void binaryTreeExample() {
        BinaryTree<Integer> tree = new BinaryTree<>(
                new BinaryNode<>(1,
                        new BinaryNode<>(2,
                                new BinaryNode<>(4, null, null),
                                new BinaryNode<>(5, null, null)),
                        new BinaryNode<>(3,
                                new BinaryNode<>(6, null, null),
                                new BinaryNode<>(7, null, null))
                )
        );

        Iterator<Node<Integer>> preorderIterator = tree.createPreorderIterator();
        Iterator<Node<Integer>> inorderIterator = tree.createInorderIterator();
        Iterator<Node<Integer>> postorderIterator = tree.createPostorderIterator();

        System.out.println("Preorder");
        while (preorderIterator.hasMore()) {
            System.out.println(preorderIterator.getNext().getValue());
        }

        System.out.println("-------");
        System.out.println("Inorder");
        while (inorderIterator.hasMore()) {
            System.out.println(inorderIterator.getNext().getValue());
        }

        System.out.println("---------");
        System.out.println("Postorder");
        while (postorderIterator.hasMore()) {
            System.out.println(postorderIterator.getNext().getValue());
        }
    }

}
