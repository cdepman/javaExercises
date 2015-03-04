package com.cdepman.linkedlist;

public class Node {

  private int value;
  private Node next = null;

  public Node(int value, Node next){
    this.value = value;
    this.next = next;
  }

  public Node(int value){
    this.value = value;
  }

  public Node getNext(){
    return this.next;
  }

  public int getValue(){
    return this.value;
  }

  public void setNext(Node node){
    this.next = node;
  }
}