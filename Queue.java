class Queue{

  private int[] storage = new int[10];
  private int count = 0;

  public int pop(){
    int temp = storage[0];
    count = count - 1;
    for (int i = 0; i < storage.length-1; i = i + 1){
      storage[i] = storage[i+1];
    }
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
    Queue myQueue = new Queue();
    myQueue.push(1);
    myQueue.push(3);
    myQueue.push(5);
    System.out.println(myQueue.length());
    System.out.println(myQueue.pop());
    System.out.println(myQueue.length());
    myQueue.push(88);
    System.out.println(myQueue.length());
    myQueue.push(99);
  }
}