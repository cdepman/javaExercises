import java.util.ArrayList;

class AllAnagrams {

  private ArrayList<String> result = new ArrayList<String>();

  public void findAnagrams(String builderString, String remainingChars, String inputString){
    if (builderString != null && builderString.length() == inputString.length()){
      result.add(builderString);
      return;
    }
    for (int i = 0; i < remainingChars.length(); i++){
      findAnagrams(builderString+remainingChars.charAt(i), removeChar(remainingChars, i), inputString);
    }
  }

  public String removeChar(String targetString, int index){
    String cleanedString = "";

    for (int i = 0; i < index; i++){
      cleanedString += targetString.charAt(i);
    }
    for (int j = index+1; j < targetString.length(); j++){
      cleanedString += targetString.charAt(j);
    }
    System.out.println(cleanedString);
    return cleanedString;
  }

  public ArrayList<String> getResult(){
    return this.result;
  }

  public static void main(String[] args) {
    AllAnagrams allAnagrams = new AllAnagrams();
    allAnagrams.findAnagrams("", "the", "the");
    System.out.println(allAnagrams.getResult());
  }
}