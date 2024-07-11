package System.out;

public class Primenumber {

	public static void main(String[] args) {
		int n =8;
		int count=0;
		for(int i=2;i<n;i++){
			if(n%i==0) {
				count++;
				break;
			}
		}
			if(count>0) {
				System.out.println("given number is not prime number");
			} 
			else {
				System.out.println("given number is prime number");
			}
		
	}
}
 