package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (2.78ms, 78.1MB)
테스트 2 〉	통과 (1.73ms, 77.4MB)
테스트 3 〉	통과 (0.39ms, 73.8MB)
테스트 4 〉	통과 (0.09ms, 74.7MB)
테스트 5 〉	통과 (0.11ms, 72.9MB)
테스트 6 〉	통과 (0.05ms, 75.1MB)
테스트 7 〉	통과 (2.19ms, 78.9MB)
테스트 8 〉	통과 (2.36ms, 77MB)
테스트 9 〉	통과 (1.38ms, 74.8MB)
테스트 10 〉	통과 (2.83ms, 77.6MB)
테스트 11 〉	통과 (2.01ms, 74.7MB)
 */
public class _30_수열과_구간_쿼리_2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        int[] answer = solution(arr, queries);
        System.out.println(Arrays.toString(answer));
    }

    final static int OVER_RANGE = 1_000_001;
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i=0; i<queries.length; i++) {
            int min = OVER_RANGE;
            int s = queries[i][0], e = queries[i][1], k = queries[i][2];
            for (int j=s; j<=e; j++) {
                if (arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }
            answer[i] = min == OVER_RANGE ? -1 : min;
        }
        return answer;
    }
}
