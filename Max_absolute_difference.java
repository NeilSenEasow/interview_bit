public class Max_absolute_difference {
    public int maxArr(int[] A) {
        int temp = 0;
        int largest = Integer.MIN_VALUE;  // Use Integer.MIN_VALUE to handle all negative arrays
        int n = A.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp = Math.abs(A[i] - A[j]) + Math.abs(i - j); // Correct formula
                if (temp > largest) {
                    largest = temp;
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Max_absolute_difference obj = new Max_absolute_difference();
        int[] testArray = {1, 3, -1};
        int result = obj.maxArr(testArray);
        System.out.println(result);
    }
}
