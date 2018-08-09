package tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testBSTNConstructor() {
        Node node = new Node(10);
        assertEquals(node.value, 10);
        assertEquals(node.right, null);
        assertEquals(node.left, null);
    }


    @Test
    public void testBSTConstructor() {
        BinarySearchTree bst = new BinarySearchTree();

        assertEquals(bst.root, null);
    }

    @Test
    public void testBSTInsert() {
        BinarySearchTree bst = new BinarySearchTree();


        //    10    -> bst.root
        //   /
        //  3       -> bst.root.left
        bst.insert(10);
        bst.insert(3);

        assertEquals(bst.root.left.value, 3);


        //                            10    -> bst.root.value
        //                           /  \
        //  bst.root.left.value  <- 3    16 -> bst.root.right.value
        //                              /
        //                            14    -> bst.root.left.value
        bst.insert(16);
        bst.insert(14);

        assertEquals(bst.root.right.value, 16);
        assertEquals(bst.root.right.left.value, 14);
    }

    @Test
    public void testBSTContains() {
        BinarySearchTree bst = new BinarySearchTree();
        assertEquals(bst.contains(1), false);

        bst.insert(10);
        assertEquals(bst.contains(10), true);
        assertEquals(bst.contains(3), false);

        bst.insert(3);
        assertEquals(bst.contains(3), true);

        assertEquals(bst.contains(11), false);
        bst.insert(11);
        assertEquals(bst.contains(11), true);
    }

    @Test void testBSTDelete() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.delete(1);
        assertEquals(tree.root, null);

        // Create following BST
        //        50
        //       /  \
        //     30    70
        //    /  \   / \
        //  20   40 60  80
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        assertEquals(tree.root.left.right.value, 40);
        assertEquals(tree.root.right.left.value, 60);

        tree.delete(50);

        assertEquals(tree.root.value, 60);

        tree.delete(30);

        assertEquals(tree.root.left.value, 40);
    }
}


