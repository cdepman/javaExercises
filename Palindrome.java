class Palindrome{

  public static boolean isPalindrome(String word){

    int half = ((int) Math.floor(word.length()/2));
    int length = word.length();

    for (int i = 0; i <= half; i = i + 1){
      if (word.charAt(i) != word.charAt(length - i - 1)){
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args){
    System.out.println(isPalindrome(args[0]));
  }
}