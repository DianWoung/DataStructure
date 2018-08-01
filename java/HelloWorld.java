import tree.BST;

public class HelloWorld {
    public int num = 1;
    public  static String str = "dian";
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {5,3,6,8,4,2};
        for (int num: nums)
            bst.add(num);

        bst.preOrder();
        System.out.println("=======\n");
        bst.removeMin();
        bst.preOrderNR();
        System.out.println("=======\n");
        bst.inOrder();
        System.out.println("=======\n");
        bst.postOrder();

        System.out.println("=======\n");
        bst.levelOrder();


    }
}