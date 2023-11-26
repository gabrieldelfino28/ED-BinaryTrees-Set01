package controller.content;

import model.binarytrees.integer.IntTree;

public class BinaryTree_02 {
    public void printResult() throws Exception {
        System.out.println("BinaryTree 02");

        int[] vet = {33, 15, 41, 38, 47, 34, 49, 43};
        IntTree tree = new IntTree();

        for (int val : vet) {
            tree.insert(val);
        }

        System.out.print("preFix: ");
        tree.preFixSearch();
        System.out.print("\ninFix: ");
        tree.inFixSearch();
        System.out.print("\npostFix: ");
        tree.postFixSearch();
        System.out.println();
    }
}
