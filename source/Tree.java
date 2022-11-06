package com.hamidnagizadeh;


import java.util.ArrayList;

public class Tree {

  Node root;
  private ArrayList<Node> nodes=new ArrayList<>();

  public  void showArray(){
    for (Node iterator:nodes){
      System.out.print(iterator.data +" ");
    }
  }

 public void addNode(String data ,String left,String right){

  if (left.equals("-1") && right.equals("-1")) {
    Node node = new Node(data, null,null);
    nodes.add(node);
  }
  else if (!left.equals("-1") && !right.equals("-1")) {
    Node leftNode=null;
    Node rightNode=null;
    for (Node data_iterator : nodes) {
      if (data_iterator.data.contains(left)) {
         leftNode = data_iterator;
        break;
      }
    }
    for (Node data_iterator : nodes) {
      if (data_iterator.data.contains(right)) {
         rightNode = data_iterator;
        break;
      }
    }
    Node node = new Node(data, leftNode, rightNode);
    nodes.add(node);
  }
  else if (left.equals("-1")){
    for (Node data_iterator : nodes) {
      if ( data_iterator.data.contains(right)) {
        Node rightNode = data_iterator;
        Node node = new Node(data, null, rightNode);
        nodes.add(node);
        break;
      }
    }
  }
  else {
    for (Node data_iterator : nodes) {
      if (data_iterator.data.contains(left)) {
        Node leftNode = data_iterator;
        Node node = new Node(data, leftNode,null);
        nodes.add(node);
        break;
      }
    }
  }
 }

 public Node getRoot(){
   return nodes.get(nodes.size()-1);
 }

 public Node defaultTree(){

   Node node7=new Node("h",null,null);
   Node node6=new Node("g",null,null);
   Node node5=new Node("f",null,null);
   Node node4=new Node("e",node6,node7);
   Node node3=new Node("d",node5,null);
   Node node2=new Node("c",node4,null);
   Node node1=new Node("b",null,node3);
   return new Node("a",node1,node2);
 }
 }



