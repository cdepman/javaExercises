import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class ArrayExercises{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();

    list.add("Remus");
    list.add("Romulus");
    list.add("Rhea Silvia");
    list.add("Mars");

    for (String s: list){
      System.out.println(s);
    }

    for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
      String nextItem = iter.next();
      if (nextItem.equals("Mars")){
        iter.remove();
      } else {
        System.out. println(nextItem);
      }
    }

    for (String s: list){
      System.out.println(s);
    }
  }
}