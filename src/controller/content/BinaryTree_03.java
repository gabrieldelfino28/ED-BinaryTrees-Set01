package controller.content;

import model.binarytrees.chars.CharTree;

public class BinaryTree_03 {
    public void printResult() throws Exception {
        System.out.println("\nBinaryTree 03");

        char[] vet = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};

        CharTree tree = new CharTree();

        for (char val : vet) {
            tree.insert(val);
        }
        tree.remove('F');
        tree.remove('U');

        System.out.print("preFix: ");
        tree.preFixSearch();
        System.out.print("\ninFix: ");
        tree.inFixSearch();
        System.out.print("\npostFix: ");
        tree.postFixSearch();
        System.out.println();

    }
}
