class VowelCount {
  public static int VowelCount(String inputString){
    char[] vowels = {'a','e','i','o','u'};
    int count = 0;
    for (int i = 0; i < inputString.length(); i = i + 1){
      if (containsChar(vowels, inputString.charAt(i))){
        count = count + 1;
      }
    }
    return count;
  }

  public static boolean containsChar(char[] charArray, char target){
    for (int i = 0; i < charArray.length; i = i + 1){
      if (charArray[i] == target){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args){
    System.out.println(VowelCount.VowelCount(args[0]));
  }
}