package view;

import controller.content.BinaryTree_02;
import controller.content.BinaryTree_03;
import controller.content.BinaryTree_04;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BinaryTree_02 exec02 = new BinaryTree_02();
        BinaryTree_03 exec03 = new BinaryTree_03();
        BinaryTree_04 exec04 = new BinaryTree_04();
        try {
            exec02.printResult();
            exec03.printResult();
            exec04.printResult();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
