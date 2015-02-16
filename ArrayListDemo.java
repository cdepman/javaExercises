import java.util.ArrayList;

class ArrayListDemo {
  public static void main(String[] args){
    ArrayList<String> myStringArray = new ArrayList<String>();
    myStringArray.add("Wonderland");
    myStringArray.add("Never Never Land");
    myStringArray.add("Hogwarts");

    int size = myStringArray.size();
    System.out.println(size);

    for (String place: myStringArray){
      System.out.println(place);
      if (place == "Hogwarts"){
        System.out.println("Found Hogwarts");
      }
    }

    
    myStringArray.remove("Hogwarts");

    int newSize = myStringArray.size();
    System.out.println(newSize);
  }
}