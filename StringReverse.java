class StringReverse{
	static String StringReverse(String stringToReverse){
		char[] chars = stringToReverse.toCharArray();
		char[] result = new char[chars.length];
		for (int i = chars.length - 1; i >= 0; i = i - 1) {

			result[i] = chars[chars.length - i - 1];
		}
		String reversedString = new String(result);
		return reversedString;
	}

	public static void main(String[] args){
		StringReverse reverse = new StringReverse();
		System.out.println(reverse.StringReverse(args[0]));
	}
}