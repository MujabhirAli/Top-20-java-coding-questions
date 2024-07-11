package System.out;

public class Swapwithout3variable {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		 a=a+b;
		 b= a-b;
		 a= a-b;
		System.out.print("After swap " + a+ "," +b);
	}

}
