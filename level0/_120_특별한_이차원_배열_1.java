package level0;

public class _120_특별한_이차원_배열_1 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i=0; i<n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}
