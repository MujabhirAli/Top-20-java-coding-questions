package System.out;

public class Reverseaarray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int i=0;
		int j=arr.length-1;
        System.out.println("before reverse:");
        for(int k=0;k<arr.length;k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.println();

while(i<j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	i=i+1;
	j=j-1;
}

System.out.println("after reverse:");
for(int k=0;k<arr.length;k++) {
    System.out.print(arr[k]+" ");
}
	}

}
