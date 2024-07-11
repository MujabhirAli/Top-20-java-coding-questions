package System.out;

public class Fibonaccinotusingrecursion {

	public static void main(String[] args) {
		int n=10;
		int n1=0;
		int n2=1;
		int nextn;
		System.out.print("Fibonacci Series up to " + n + " terms:");

		for(int i=0;i<=n;i++) {
			System.out.print(n1 + " ");
			nextn=n1+n2;
			n1=n2;
			n2=nextn;
		}

	}

}
