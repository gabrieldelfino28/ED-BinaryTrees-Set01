package controller.content;

import model.binarytrees.integer.IntTree;

public class BinaryTree_04 {
    public void printResult() throws Exception {
        System.out.println("\nBinaryTree 04");

        int[] vet = {7, 8, 3, 4, 2, 1, 6, 5};
        IntTree tree = new IntTree();

        for (int val : vet) {
            tree.insert(val);
        }

        tree.remove(7);
        tree.remove(6);

        System.out.print("preFix: ");
        tree.preFixSearch();
        System.out.print("\ninFix: ");
        tree.inFixSearch();
        System.out.print("\npostFix: ");
        tree.postFixSearch();
        System.out.println();
    }
}
