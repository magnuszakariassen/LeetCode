package com.magnuszakariassen.leetcode.misc.binary;

import java.util.Arrays;

public class BinaryTree {

    Node rootNode;


    /**
     * Creates a binary tree with the array of integers. A binary tree is a set of nodes with an integer value.
     * Each node can have either 0, 1 or 2 children nodes, given as leftChild and rightChild.
     * The value of the rightChild node is always greater than the value of the node (parent)
     * The value of the leftChild node is always smaller than the value of the node (parent)
     * Example of binary tree with the numbers 1,2,3,4,5,6,7
     *        4
     *      /  \
     *     2    6
     *    / \  / \
     *   1  3 5   7
     * @param values Values to be inserted into the binary tree
     * @return
     */
    public BinaryTree createBinaryTree(int... values) {
        BinaryTree binaryTree = new BinaryTree();

        Arrays.stream(values).forEach(binaryTree::add);
        return binaryTree;
    }
    public void add(int value) {
        rootNode = addRecursive(rootNode, value);
    }

    public boolean contains(int value) {
        return containsRecursive(rootNode, value);
    }

    public void delete(int value) {
        rootNode = deleteRecursive(rootNode, value);
    }

    private Node addRecursive(Node currentNode,
                              int valueToAdd) {
        if (currentNode == null) {
            return new Node(valueToAdd);
        }

        if (valueToAdd > currentNode.value) {
            currentNode.rightChild = addRecursive(currentNode.rightChild, valueToAdd);
        } else if (valueToAdd < currentNode.value) {
            currentNode.leftChild = addRecursive(currentNode.leftChild, valueToAdd);
        } else {
            return currentNode;
        }
        return currentNode;
    }

    private boolean containsRecursive(Node currentNode,
                                      int queryValue) {
        if (currentNode == null) {
            return false;
        }

        int currentValue = currentNode.value;
        if (queryValue == currentValue) {
            return true;
        }

        return queryValue > currentValue
                ? containsRecursive(currentNode.rightChild, queryValue)
                : containsRecursive(currentNode.leftChild, queryValue);

    }

    private Node deleteRecursive(Node currentNode,
                                 int valueToDelete) {
        if (currentNode == null) {
            return null;
        }

        int currentValue = currentNode.value;
        if (valueToDelete == currentValue) {
            if (currentNode.leftChild == null && currentNode.rightChild == null) {
                return null;
            }
            if (currentNode.rightChild == null) {
                return currentNode.leftChild;
            }

            if (currentNode.leftChild == null) {
                return currentNode.rightChild;
            }

            int smallestValue = findSmallestValue(currentNode.rightChild);
            currentNode.value = smallestValue;
            currentNode.rightChild = deleteRecursive(currentNode.rightChild, smallestValue);
            return currentNode;
        }

        if (valueToDelete < currentValue) {
            currentNode.leftChild =  deleteRecursive(currentNode.leftChild, valueToDelete);
        } else {
            currentNode.rightChild = deleteRecursive(currentNode.rightChild, valueToDelete);
        }
        return currentNode;
    }

    private int findSmallestValue(Node currentNode) {
        return currentNode.leftChild == null
                ? currentNode.value
                : findSmallestValue(currentNode.leftChild);
    }




    private static class Node {
        int value;
        Node leftChild;
        Node rightChild;

        Node(int value) {
            this.value = value;
            this.rightChild = null;
            this.leftChild = null;
        }
    }
}
