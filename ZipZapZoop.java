class ZipZapZoop{
	public static void main(String[] args){
		int endVal = Integer.parseInt(args[0]);
		int startVal = 1;
		while (startVal < endVal){
			if (startVal % 15 == 0) {
				System.out.println("Zoop");
			} else if (startVal % 5 == 0) {
				System.out.println("Zip");
			} else if (startVal % 3 == 0) {
				System.out.println("Zap");
			} else {
				System.out.println(startVal);
			}
			startVal = startVal + 1;
		}
	}
}