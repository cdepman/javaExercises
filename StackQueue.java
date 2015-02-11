class StackQueue{

  private Stack inbox = new Stack();
  private Stack outbox = new Stack();

  public void enqueue(int value){
    inbox.push(value);
  }

  public int dequeue(){
    if (outbox.length() == 0){
      while(inbox.length() != 0){
        outbox.push(inbox.pop());
      }
    }
    
    int returnValue = outbox.pop();
  
    return returnValue;
  }

  public int length(){
    return inbox.length() + outbox.length();
  }

  public static void main(String[] args){
    StackQueue myStackQueue = new StackQueue();
    myStackQueue.enqueue(55);
    myStackQueue.enqueue(75);
    myStackQueue.enqueue(95);
    System.out.println(myStackQueue.length());
    System.out.println(myStackQueue.dequeue());
    System.out.println(myStackQueue.length());
    System.out.println(myStackQueue.dequeue());
    System.out.println(myStackQueue.length());
  }
}