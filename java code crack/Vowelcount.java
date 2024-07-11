package System.out;

public class Vowelcount {

	public static void main(String[] args) {
		String word = "educatuon";
		int Count = 0;
		for (int i =0; i<word.length();i++){
			char c = word.charAt(i);
			switch(c){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': 
				Count++;
				break;
			}
			

		}
		System.out.println("count of the vowels : " + Count);

	}

}
