package System.out;

public class Fibonacciusingrecursion {

public static void main(String[]args) {
	int n=10;
    for(int i=0;i<n;i++) {
    System.out.print(fib(i) + " ");
}
}
public static int fib(int n) {
	if(n==0 || n==1) {
		return n;
	}else {
		return(fib(n-1)+fib(n-2));
	}
}
}