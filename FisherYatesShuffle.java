class FisherYatesShuffle{

  public static char[] Shuffle(char[] inputArray){
    for (int i = 0; i < inputArray.length; i = i + 1){
      int swapIndex = ((int) Math.floor(Math.random()*(inputArray.length - i))) + i;
      char temp = inputArray[i];
      inputArray[i] = inputArray[swapIndex];
      inputArray[swapIndex] = temp;
    }
    return inputArray;
  }


  public static void main(String[] args){
    char[] charsArray = args[0].toCharArray();
    System.out.println(FisherYatesShuffle.Shuffle(charsArray));
  }
}