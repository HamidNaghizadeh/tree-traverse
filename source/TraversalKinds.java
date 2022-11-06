package com.hamidnagizadeh;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraversalKinds {

  public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
  public static final String RESET = "\033[0m";  // Text Reset
  public static final String RED_BOLD = "\033[1;31m";    // RED


  public static void recursiveLtrInOrder(Node root) {
    if (root != null) {
      recursiveLtrInOrder(root.left);
      System.out.print(root.data + " ");
      recursiveLtrInOrder(root.right);
    }
  }


  public static void recursiveLtrPreOrder(Node root){
    if (root!=null){
      System.out.print(root.data + " ");
      recursiveLtrPreOrder(root.left);
      recursiveLtrPreOrder(root.right);
    }
  }

  public static void recursiveLtrPostOrder(Node root){
    if (root!=null){
      recursiveLtrPostOrder(root.left);
      recursiveLtrPostOrder(root.right);
      System.out.print(root.data + " ");
    }
  }
  public static void recursiveRtlInOrder(Node root) {
    if (root != null) {
      recursiveRtlInOrder(root.right);
      System.out.print(root.data + " ");
      recursiveRtlInOrder(root.left);
    }
  }


  public static void recursiveRtlPreOrder(Node root){
    if (root!=null){
      System.out.print(root.data + " ");
      recursiveRtlPreOrder(root.right);
      recursiveRtlPreOrder(root.left);
    }
  }

  public static void recursiveRtlPostOrder(Node root){
    if (root!=null){
      recursiveRtlPostOrder(root.right);
      recursiveRtlPostOrder(root.left);
      System.out.print(root.data + " ");
    }
  }

  public static void nrLtrInOrder(Node root){
    Stack<Node> stack=new Stack<>();

    while(true){
      for (;root!=null; root=root.left){
        stack.push(root);
      }
     if (!stack.isEmpty()) {
        root = stack.pop();
     }
      if (root == null) {
        break;
      }
      System.out.print(root.data + " ");
      root = root.right;

    }
  }
  public static void nrLtrPreOrder(Node root){
    Stack<Node> stack=new Stack<>();

    while(true){
      for (;root!=null; root=root.left){
        System.out.print(root.data + " ");
        stack.push(root);
      }
      if (!stack.isEmpty()) {
        root = stack.pop();
      }
      if (root == null) {
        break;
      }
      root = root.right;

    }
  }
  public static void nrLtrPostOrder(Node root){
    Stack<Node> stack=new Stack<>();

      stack.push(root);

      Stack<String> out = new Stack<>();

      while (!stack.empty())
      {
        Node curr = stack.pop();
        out.push(curr.data);

        if (curr.left != null) {
          stack.push(curr.left);
        }

        if (curr.right != null) {
          stack.push(curr.right);
        }
      }

      while (!out.empty()) {
        System.out.print(out.pop() + " ");
      }

  }

 public static void nrRtlInOrder(Node root){
    Stack<Node> stack=new Stack<>();

    while(true){
      for (;root!=null; root=root.right){
        stack.push(root);
      }
      if (!stack.isEmpty()) {
        root = stack.pop();
      }
      if (root == null) {
        break;
      }
      System.out.print(root.data + " ");
      root = root.left;

    }
  }
  public static void nrRtlPreOrder(Node root){
    Stack<Node> stack=new Stack<>();

    while(true){
      for (;root!=null; root=root.right){
        System.out.print(root.data + " ");
        stack.push(root);
      }
      if (!stack.isEmpty()) {
        root = stack.pop();
      }
      if (root == null) {
        break;
      }
      root = root.left;

    }
  }

  public static void nrRtlPostOrder(Node root){
    Stack<Node> stack=new Stack<>();

    stack.push(root);

    Stack<String> out = new Stack<>();

    while (!stack.empty())
    {

      Node curr = stack.pop();
      out.push(curr.data);

      if (curr.right != null) {
        stack.push(curr.right);
      }

      if (curr.left != null) {
        stack.push(curr.left);
      }
    }

    while (!out.empty()) {
      System.out.print(out.pop() + " ");
    }

  }

  public static void levelOrder(Node root){
    Queue<Node> queue=new LinkedList<>();
    if (root==null){
      return;
    }
    queue.add(root);

    while(true){
      if (queue.size()!=0) {
        root = queue.remove();
      }
      else {
        root=null;
      }
      if (root!=null){
        System.out.print(root.data + " ");
        if (root.left!=null){
          queue.add(root.left);
        }
        if (root.right!=null ){
          queue.add(root.right);
        }
      }
      else break;
    }
  }



}
