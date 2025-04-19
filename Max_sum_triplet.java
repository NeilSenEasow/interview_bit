import java.util.TreeSet;

public class Max_sum_triplet {
    public int solve(int[] A) {
        int n = A.length;
        if (n < 3) return 0;

        int[] maxRight = new int[n];
        maxRight[n - 1] = A[n - 1];

        // Fill maxRight: for each index, store the max to its right
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(A[i], maxRight[i + 1]);
        }

        TreeSet<Integer> leftSet = new TreeSet<>();
        leftSet.add(A[0]);
        int maxSum = 0;

        for (int j = 1; j < n - 1; j++) {
            leftSet.add(A[j]);

            Integer left = leftSet.lower(A[j]); // Ai < Aj
            int right = maxRight[j + 1];        // Ak > Aj

            if (left != null && right > A[j]) {
                maxSum = Math.max(maxSum, left + A[j] + right);
            }
        }

        return maxSum;
    }
}
//testing commits
//more commits 