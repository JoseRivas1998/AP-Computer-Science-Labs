/**
 * @author Jose de Jesus Rodriguez Rivas
 * @version 2/23/19
 */
public class BinaryTreeDriver {

    public static void main(String[] args) {
        BinaryIntSearchTree bst = new BinaryIntSearchTree(1, 5, 6, 2, 5, 1, 6, 10, 15, 32, 12, 143);
        System.out.println("In order traversal:");
        bst.printInOrder();
        System.out.println("Pre order traversal:");
        bst.printPreOrder();
        System.out.println("Post order traversal:");
        bst.printPostOrder();
    }

}
