package System.out;

public class Removeelementsinarray {

	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,4,5,6,7,76};
		int j=1;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j]=a[i+1];
				j++;
			}
		}
		System.out.println("count:" + j);

		for(int i=0;i<j;i++) {
			System.out.println(a[i] + "");

		}
	}

}
