public class Solution {
    public int[] maxset(int[] A) {
        long maxSum = -1, currentSum = 0;
        int maxStart = -1, maxEnd = -1;
        int currentStart = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                currentSum += A[i];
                if (maxSum < currentSum || 
                    (maxSum == currentSum && (maxEnd - maxStart < i - currentStart))) {
                    maxSum = currentSum;
                    maxStart = currentStart;
                    maxEnd = i;
                }
            } else {
                currentSum = 0;
                currentStart = i + 1;
            }
        }

        if (maxStart == -1) return new int[0];

        return Arrays.copyOfRange(A, maxStart, maxEnd + 1);
    }
}
