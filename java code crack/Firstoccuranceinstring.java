package System.out;

public class Firstoccuranceinstring {

	public static void main(String[] args) {
		String str ="mujrow";
		char tofind ='m';
		int occurance=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==tofind) {
				occurance++;	
			}
	}
        System.out.println("number of occurance " + occurance);

	}

}
