//check vowel present in java in java
public class vowel{
public static void main(String args[]){
 String word = "educatuon";
 int Count = 0;

for (int i =0; i<word.length();i++){
	char c = word.charAt(i);
	switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': 
		Count++;
		break;
	}
	

}
if(Count==0)	System.out.print("no vowels present");
else
System.out.println("count of the vowels : " + Count);
}}