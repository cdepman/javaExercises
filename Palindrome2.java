class Palindrome {
  
  public boolean palindrome1(String input){
    String reverse = "";
    for (int i = input.length() - 1; i >= 0; i--){
      reverse += input.charAt(i);
    }

    return input.equals(reverse);
  }
  
  public boolean palindrome2(String input){
      for (int i = 0; i < Math.floor(input.length()/2); i++){
          if (input.charAt(i) != input.charAt(input.length()-i-1)){
              return false;
          }
      }
      return true;
  }

  public static void main(String[] args){
    Palindrome palindrome = new Palindrome();
    System.out.println(palindrome.palindrome1("neveroddoreven"));
    System.out.println(palindrome.palindrome2("neveroddoreven"));
  }
}