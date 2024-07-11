package System.out;

public class Reversenumber {

	public static void main(String[] args) {
		int number=12345;
		int rev_number=0;
		while(number!=0) {
			int digit =number%10;
			rev_number=rev_number * 10+ digit;
			number=number/10;
		}
		System.out.println("Reverse number:" + rev_number);
	}

}
