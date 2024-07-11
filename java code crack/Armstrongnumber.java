package System.out;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:" );
		int num=in.nextInt();
		int arm=num;
		while(num!=0) {
			int s=num%10;
			sum=sum+(s*s*s);
			num=num/10;
		}
		if(arm==sum) {
			System.out.println(arm + " is armstromg number" );
		}else {
			System.out.println(arm + " is not armstromg number" );

		}

	}

}
