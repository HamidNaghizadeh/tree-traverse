package com.hamidnagizadeh;

public class Node {
  String data;
  Node left;
  Node right;

  public Node(){
    this(null,null,null);
  }

  public Node(String data,Node left, Node right){
    this.data=data;
    this.left=left;
    this.right=right;
  }
}
