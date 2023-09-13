package level0;

import java.util.Arrays;

public class _29_수열과_구간_쿼리_3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};
        int[] answer = solution(arr, queries);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            swap(arr, query[0], query[1]);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
