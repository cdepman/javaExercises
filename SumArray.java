class SumArray{

  public int sumArrayNaive(int[] intArray){
    int max = Integer.MIN_VALUE;
    int currentSum;
    for (int i = 0; i < intArray.length; i++){
      currentSum = 0;
      for (int j = i; j < intArray.length; j++){
        currentSum += intArray[j];
        if(currentSum > max){
          max = currentSum;
        }
      }
    }

    return max;
  }

  public int sumArrayFast(int[] intArray){
    int max = Integer.MIN_VALUE;
    int currentSum = 0;
    for (int i = 0; i < intArray.length; i++){
      currentSum += intArray[i];
      if (currentSum > max){
        max = currentSum;
      }
      if (currentSum < 0){
        currentSum = 0;
      }
    }
    return max;
  }



  public static void main(String[] args){

    SumArray sumArray = new SumArray();
    int[] testArray = {1,2,3,-3,-6,7,8,-19};
    int[] testArray2 = {3,0,-1,-4,6,-3,2,-3,9,1,-5};
    int[] testArray3 = {-3,-1,-4,-6,-3,-2,-3,-9,-1,-5};

    System.out.println(sumArray.sumArrayNaive(testArray));    
    System.out.println(sumArray.sumArrayFast(testArray));    
    System.out.println(sumArray.sumArrayNaive(testArray2));    
    System.out.println(sumArray.sumArrayFast(testArray2));       
    System.out.println(sumArray.sumArrayFast(testArray3));       

  }



}