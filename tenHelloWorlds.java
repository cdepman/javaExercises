import java.io.*;

class TenHelloWorlds {
	public static void main(String[] args){
		for (int i = 1; i < 11; i++){
			System.out.println("Hello World #" + i);
		}
		String text = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			 text = in.readLine();
		}catch(IOException e){
		  e.printStackTrace();
		}
		System.out.println("Type: " + text.getClass().getName());
		System.out.println("You Said: " + text);
	}
}