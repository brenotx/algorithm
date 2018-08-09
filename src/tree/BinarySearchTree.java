package tree;

/**
 * @Author Breno Teixeira
 */
public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        this.root = null;
    }

    /**
     * Insert a new value in the tree.
     *
     * Cases:
     *      - Tree is empty
     *      - Value is less than root's subtree and should be added in the left side
     *      - Value is greater than root's subtree and should be added in the right side
     *
     * @param value
     */
    void insert(int value) {
        root = insertRecursive(this.root, value);
    }

    /**
     * Check if the given value is in the tree.
     *
     * Cases:
     *      - Tree is empty
     *      - Value is in the root
     *      - Value might be in the root's left subtree
     *      - Value might be in the root's right subtree
     *
     * @param value
     * @return true if the tree has the given value, otherwise false.
     */
    boolean contains(int value) {
        return containsRecursive(this.root, value);
    }

    /**
     * Delete the given value from the tree.
     *
     * Cases:
     *      - Tree is empty
     *      - Node to be deleted is leaf
     *      - Node to be deleted has only one child
     *      - Node to be deleted has two children
     * @param value
     */
    void delete(int value) {
        root = deleteRecursive(this.root, value);
    }

    private Node insertRecursive(Node root, int value){

        // The current node is null, we’ve reached a leaf
        // node and we can insert the new node in that position.
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insertRecursive(root.left, value);
        } else if (value > root.value) {
            root.right = insertRecursive(root.right, value);
        }

        return root;
    }

    private boolean containsRecursive(Node root, int value) {

        if (root == null) {
            return false;
        }

        if (root.value == value) {
            return true;
        }

        return value < root.value
                ? containsRecursive(root.left, value)
                : containsRecursive(root.right, value);
    }

    private Node deleteRecursive(Node root, int value) {

        if (root == null) {
            return null;
        }

        // Node found
        if (value == root.value) {

            // Node to be deleted has only one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node to be deleted has two children: : Get the inorder successor (smallest
            // in the right subtree)
            root.value = findSmallestValue(root.right);

            // Delete the inorder successor
            root.right = deleteRecursive(root.right, root.value);


        } else if (value < root.value) {
            root.left = deleteRecursive(root.left, value);
        } else {
            root.right = deleteRecursive(root.right, value);
        }
        return root;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

}
