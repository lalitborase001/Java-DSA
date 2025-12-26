import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        BinaryTree tree = new BinaryTree();
////        tree.populate(scanner);
////        tree.prettyDisplay();
//
//        BST bst = new BST();
//        int[] nums = {2,3,4,8,5,1,34,9};
//        bst.populate(nums);
//        bst.display();
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();

    }
}