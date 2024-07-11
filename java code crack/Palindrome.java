package System.out;

public class Palindrome {

	public static void main(String[] args) {
	String str= "malayalam";
	String rev="";
	System.out.println("orginal string :" + str);
	for(int i =str.length()-1;i>=0;i--) {
		 rev += str.charAt(i);
	}
	System.out.println("reverse string :" + rev);
if(str.equals(rev)) {
	System.out.println("it is palindrome");
}else {
	System.out.println("it is not palindrome");

}
	}

}
