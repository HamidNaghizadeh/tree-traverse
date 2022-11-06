package com.hamidnagizadeh;

import java.util.Scanner;


public class Main {

    static Tree tree=new Tree();

    public static void recursiveMenu(Node root){
        Scanner s=new Scanner(System.in);
        System.out.println(TraversalKinds.YELLOW_BOLD + "\n*****Enter the number of the act you want***** " +TraversalKinds.RESET);
        System.out.println("1 - LtR inOrder Traversal");
        System.out.println("2 - LtR preOrder Traversal");
        System.out.println("3 - LtR postOrder Traversal");
        System.out.println("4 - Rtl inOrder Traversal");
        System.out.println("5 - Rtl preOrder Traversal");
        System.out.println("6 - Rtl postOrder Traversal");

        int selectedItem=s.nextInt();

        switch (selectedItem){
            case 1 : TraversalKinds.recursiveLtrInOrder(root);break;
            case 2 : TraversalKinds.recursiveLtrPreOrder(root);break;
            case 3 : TraversalKinds.recursiveLtrPostOrder(root);break;
            case 4 : TraversalKinds.recursiveRtlInOrder(root);break;
            case 5 : TraversalKinds.recursiveRtlPreOrder(root);break;
            case 6 : TraversalKinds.recursiveRtlPostOrder(root);break;
        }

    }
    public static void nonRecursiveMenu(Node root){
        Scanner s=new Scanner(System.in);
        System.out.println(TraversalKinds.YELLOW_BOLD + "\n*****Enter the number of the act you want*****" + TraversalKinds.RESET);
        System.out.println("1 - LtR inOrder Traversal");
        System.out.println("2 - LtR preOrder Traversal");
        System.out.println("3 - LtR postOrder Traversal");
        System.out.println("4 - Rtl inOrder Traversal");
        System.out.println("5 - Rtl preOrder Traversal");
        System.out.println("6 - Rtl postOrder Traversal");

        int selectedItem=s.nextInt();

        switch (selectedItem){
            case 1 : TraversalKinds.nrLtrInOrder(root);break;
            case 2 : TraversalKinds.nrLtrPreOrder(root);break;
            case 3 : TraversalKinds.nrLtrPostOrder(root);break;
            case 4 : TraversalKinds.nrRtlInOrder(root);break;
            case 5 : TraversalKinds.nrRtlPreOrder(root);break;
            case 6 : TraversalKinds.nrRtlPostOrder(root);break;
        }

    }

    public static void addTreeMenu(){
        while(true){
            Scanner s=new Scanner(System.in);
            System.out.println(TraversalKinds.YELLOW_BOLD + "\n***** Enter your nodes from bottom to top ***** \n if you want to finish adding nodes write finish." + TraversalKinds.RESET);
            System.out.println("Enter the data you want to put in the node :");
            String data=s.next();
            System.out.println("Enter left child's data");
            String left=s.next();
            System.out.println("Enter right child's data");
            String right=s.next();
            tree.addNode(data,left,right);
            String finish=s.next();
            if (finish.equals("finish")){
                tree.showArray();
                menu(tree.getRoot());
                break;
            }
        }
    }

    public static void menu(Node root){

        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println(TraversalKinds.YELLOW_BOLD+"\n***** Enter the number of the act you want ***** " + TraversalKinds.RESET);
            System.out.println("1 - Recursive Traversals");
            System.out.println("2 - NonRecursive Traversals");
            System.out.println("3 - Level Traversal");
            System.out.println("4 - Adding Nodes of a Tree");
            System.out.println("5 - Exit" );
            int selectedItem=s.nextInt();
            switch(selectedItem){
                case 1 : recursiveMenu(root);break;
                case 2 : nonRecursiveMenu(root);break;
                case 3 : TraversalKinds.levelOrder(root);break;
                case 4 : addTreeMenu();break;
                case 5 : return;
            }


        }
    }

    public static void main(String[] args) {

        menu (tree.defaultTree());

    }
}

