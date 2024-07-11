//swap two numbers with and without third variable in java

public class swap{
public static void main(String args[]){
int a = 5;
int b = 10;

///with third variable
//int temp;  
//temp=a;
//a=b;
//b=temp;
///System.out.print("After swap " + a+ "," +b);

//without third variable
 a=a+b;
 b= a-b;
 a= a-b;
System.out.print("After swap " + a+ "," +b);

}}