import java.time.Period;

/**
 * This is a much more advanced data structure and not part of the
 * AP subset, however, you will see this in future classes and
 * it uses plenty of recursion
 * @author Jose de Jesus Rodriguez Rivas
 * @version 2/23/19
 */
public class BinaryIntSearchTree {

    private BinaryIntNode tree;

    public BinaryIntSearchTree() {
        this.tree = null;
    }

    public BinaryIntSearchTree(int... data) {
        this();
        for (int i = 0; i < data.length; i++) {
            add(data[i]);
        }
    }

    public boolean empty() {
        return tree == null;
    }

    public void add(int data) {
        if(tree == null) {
            tree = new BinaryIntNode(data);
        } else {
            BinaryIntNode currentNode = tree;
            boolean added = false;
            while (currentNode != null && !added) {
                if(data > currentNode.data) {
                    if(currentNode.rightChild == null) {
                        currentNode.rightChild = new BinaryIntNode(data);
                        added = true;
                    } else {
                        currentNode = currentNode.rightChild;
                    }
                } else {
                    if(currentNode.leftChild == null) {
                        currentNode.leftChild = new BinaryIntNode(data);
                        added = true;
                    } else {
                        currentNode = currentNode.leftChild;
                    }
                }
            }
        }
    }

    public void printInOrder() {
        printInOrder(tree);
        System.out.println();
    }

    public void printPreOrder() {
        printPreOrder(tree);
        System.out.println();
    }

    public void printPostOrder() {
        printPostOrder(tree);
        System.out.println();
    }

    private void printInOrder(BinaryIntNode node) {
        // TODO 2.1 Print the BST using in-order traversal recursively
    }

    private void printPreOrder(BinaryIntNode node) {
        // TODO 2.2 Print the BST using pre-order traversal recursively
    }

    private void printPostOrder(BinaryIntNode node) {
        // TODO 2.2 Print the BST using post-order traversal recursively
    }

    class BinaryIntNode {
        int data;
        BinaryIntNode leftChild;
        BinaryIntNode rightChild;

        public BinaryIntNode(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }

        public BinaryIntNode(int data, BinaryIntNode leftChild, BinaryIntNode rightChild) {
            this.data = data;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public boolean isLeaf() {
            return this.leftChild == null && this.rightChild == null;
        }

    }

}
