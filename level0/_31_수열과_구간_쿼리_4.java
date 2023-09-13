package level0;

import java.util.Arrays;

public class _31_수열과_구간_쿼리_4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
        int[] answer = solution(arr, queries);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0], e = query[1], k = query[2];
            for (int i=s; i<=e; i++) {
                if (i % k == 0) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}
