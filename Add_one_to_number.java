import java.util.Arrays;

public class Add_one_to_number {
    public static int[] plusOne(int[] A) {
        int n = A.length;
        int cursor = n - 1;
        while (true) {
            if (A[cursor] == 9) {
                A[cursor] = 0;
                cursor--;
            } else {
                A[cursor]++;
                break;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        int[] input = {9, 9, 9};
        int[] result = plusOne(input);
        System.out.println(Arrays.toString(result)); 
    }
}
