public class Stack{

  private int[] storage = new int[10];
  private int count = 0;

  public int pop(){
    int temp = storage[count-1];
    count = count - 1;
    return temp;
  }

  public void push(int value){
    storage[count] = value;
    count = count + 1;
  }

  public int length(){
    return count;
  }

  public static void main(String[] args){
    Stack myStack = new Stack();
    myStack.push(1);
    myStack.push(3);
    myStack.push(5);
    System.out.println(myStack.length());
    System.out.println(myStack.pop());
    System.out.println(myStack.length());
    myStack.push(88);
    System.out.println(myStack.length());
    myStack.push(99);
  }
}