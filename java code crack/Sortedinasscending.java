package System.out;

public class Sortedinasscending {

	public static void main(String[] args) {
		int array[]= {9,8,7,6,5,4,3,2,1};
		System.out.println("original array: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		 System.out.println();
			for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[i]) {
					int temp =array[i];
					array[i]= array[j];
					array[j]= temp;
				}
			}
			}
			System.out.println("asscending order: ");
			for(int i=0;i<array.length;i++) {
				System.out.print(array[i] + " ");
		}
			 System.out.println();
	}

}
