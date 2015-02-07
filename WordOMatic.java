class WordOMatic{
	public static void main(String[] args) {
		String[] words1 = {"buddy","pal","friend","mate"};
		String[] words2 = {"where","how"};
		String[] words3 = {"bubbles","grommets","pickaxes","pogs"};

		int length1 = words1.length;
		int length2 = words2.length;
		int length3 = words3.length;

		int random1 = (int) (Math.random() * length1);
		int random2 = (int) (Math.random() * length2);
		int random3 = (int) (Math.random() * length3);

		String word1 = words1[random1];
		String word2 = words2[random2];
		String word3 = words3[random3];

		System.out.println( "Hey " + word1 + ", " + word2 + " are my " + word3 + "?" );
	}
}
