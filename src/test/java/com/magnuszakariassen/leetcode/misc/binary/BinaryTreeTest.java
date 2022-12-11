package com.magnuszakariassen.leetcode.misc.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    private final BinaryTree binaryTree = new BinaryTree();

    /*@Test
    void createBinaryTree() {
        var result = getBinaryTree();

    }*/

    private BinaryTree getBinaryTree() {
        return binaryTree.createBinaryTree(1, 2, 4, 5);
    }

    @Test
    void add() {
    }

    @Test
    void contains() {
        var binaryTree = getBinaryTree();

        assertTrue(binaryTree.contains(2));
        assertTrue(binaryTree.contains(4));

        assertFalse(binaryTree.contains(7));
    }

    @Test
    void delete() {
        var binaryTree = getBinaryTree();

        assertTrue(binaryTree.contains(4));
        binaryTree.delete(4);
        assertFalse(binaryTree.contains(4));


    }
}