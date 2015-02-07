class Random{
	public static void main(String[] args){
		double start = Integer.parseInt(args[0]);
		double end = Integer.parseInt(args[1]);
		if (start > end){
			System.out.println(Math.floor(Math.random()*(end-start))+start);
		} else {
			System.out.println(Math.floor(Math.random()*(start-end))+end);
		}
	}
}

