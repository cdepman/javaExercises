class StringReverse{
	public static void main(String[] args){
		char[] chars = args[0].toCharArray();
		char[] result = new char[chars.length];
		for (int i = chars.length - 1; i >= 0; i = i - 1) {

			result[i] = chars[chars.length - i - 1];
		}
		String reversedString = new String(result);
		System.out.println(reversedString);
	}
}