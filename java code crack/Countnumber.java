package System.out;

public class Countnumber {

	public static void main(String[] args) {
		int given_number=1234567890;
		int count_number=0;
		while(given_number!=0) {
			given_number=given_number/10;
			count_number++;
		}
		System.out.println("count of the number:" + count_number);

	}

}
