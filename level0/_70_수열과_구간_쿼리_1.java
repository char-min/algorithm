package level0;

public class _70_수열과_구간_쿼리_1 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i=query[0]; i<=query[1]; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
}
