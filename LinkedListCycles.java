package com.cdepman.linkedlistcycles;

public class LinkedListCycles {

  public boolean hasCycle(Node startNode){
    Node slow = startNode;
    Node fast = startNode;

    while (slow.getNext() != null && fast.getNext() !=null){
      slow = slow.getNext();
      fast = fast.getNext().getNext();
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Node nodeA = new Node(1);
    Node nodeB = new Node(2);
    Node nodeC = new Node(3);
    Node nodeD = new Node(4);
    Node nodeE = new Node(5);
    nodeA.setNext(nodeB);
    nodeB.setNext(nodeC);
    nodeC.setNext(nodeD);
    nodeD.setNext(nodeE);
    
    LinkedListCycles cycleFinder = new LinkedListCycles();
    System.out.println(cycleFinder.hasCycle(nodeA));
    nodeE.setNext(nodeB);
    System.out.println(cycleFinder.hasCycle(nodeA));
  }
}