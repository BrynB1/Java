package Junior.Final;

import java.util.ArrayList;

/*
Thank you professor. Although this was a very short class I am glad that I had you as my teacher. Both you and Vincent helped
me with the assignments I didn't understand. I hope one day in the future I will have you as my professor again.
Thanks,
Bryn
 */
public class bstApp {
    public static void main(String[] args) {
        binarySearchTree bst = new binarySearchTree();
        bst.insert(20);
        bst.insert(8);
        bst.insert(22);
        bst.insert(4);
        bst.insert(12);
        bst.insert(10);
        bst.insert(14);

        System.out.println("Binary Search Tree:");
        ArrayList<Integer> elementsList = bst.display();
        for (int element : elementsList) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Search:");
        System.out.println("Is 3 in the binary tree? " + bst.search(3));
        System.out.println("Is 4 in the binary tree? " + bst.search(4));

        System.out.println("Tree height: " + bst.height());

        boolean result1 = bst.onSameBranch(8, 4);
        boolean result2 = bst.onSameBranch(8, 10);
        boolean result3 = bst.onSameBranch(12, 22);
        boolean result4 = bst.onSameBranch(4, 14);
        System.out.println("On same branch?");
        System.out.println("8 and 4 are on the same branch: " + result1);
        System.out.println("8 and 10 are on the same branch: " + result2);
        System.out.println("12 and 22 are on the same branch: " + result3);
        System.out.println("4 and 14 are on the same branch: " + result4);

        System.out.println("Difference of largest and smallest key:");
        System.out.println(bst.keyDiff());

        System.out.println("Sum of binary search tree:");
        System.out.println(bst.findSum());

        System.out.println("Smallest key: " + bst.getSmallestKey());
        System.out.println("Largest key: " + bst.getLargestKey());
    }
}
