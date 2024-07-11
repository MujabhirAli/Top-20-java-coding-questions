package System.out;

public class Counteachstring {

	public static void main(String[] args) {
        String str = "java";
        char[] arr = str.toCharArray();
        int[] count = new int[128];

        for (char c : arr) {
            count[c]++;
        }

        for (int i = 0; i < 128; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + " - " + count[i]);
            }
        }
    }
}
