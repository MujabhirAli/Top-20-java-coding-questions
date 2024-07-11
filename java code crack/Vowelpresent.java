package System.out;

import java.util.Scanner;

public class Vowelpresent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(str.matches(".*[aeiou].*"));

	}

}
