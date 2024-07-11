package System.out;

public class Reversestring {

	public static void main(String[] args) {
		String word = "malayalam";
		for(int i = word.length()-1;i>=0;i--){
		System.out.print(word.charAt(i));
		}
	}

}