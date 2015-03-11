import java.util.ArrayList;

class AllAnagrams {

  private ArrayList<String> result = new ArrayList<String>();
  private String inputString;

  public void findAnagrams(String builderString, String remainingChars){
    if (builderString.length() == inputString.length()){
      result.add(builderString);
      return;
    }
    for (int i = 0; i < remainingChars.length(); i++){
      findAnagrams(builderString+remainingChars.charAt(i), removeChar(remainingChars, i));
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
    return cleanedString;
  }

  public ArrayList<String> getResult(){
    return this.result;
  }

  public void setInputString(String inputString){
    this.inputString = inputString;
  }
  
  public String getInputString(){
    return this.inputString;
  }

  public static void main(String[] args) {
    
    AllAnagrams allAnagrams = new AllAnagrams();

    allAnagrams.setInputString("the");
    if (args.length > 0){
      allAnagrams.setInputString(args[0]);
    }

    input = allAnagrams.getInputString();
    allAnagrams.findAnagrams("", input);
    System.out.println(allAnagrams.getResult());
  }
}