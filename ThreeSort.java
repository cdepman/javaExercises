class ThreeSort{
	public static void main(String[] args){
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		int thirdNum = Integer.parseInt(args[2]);

		int min = Math.min(firstNum, Math.min(secondNum, thirdNum));
		int max = Math.max(firstNum, Math.max(secondNum, thirdNum));
		int middle = firstNum + secondNum + thirdNum - min - max;

		System.out.println("Min: " + min);
		System.out.println("Middle: " + middle);
		System.out.println("Max: " + max);
	}
}