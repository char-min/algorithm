package level0;

/*
테스트 1 〉	통과 (0.06ms, 71.5MB)
테스트 2 〉	통과 (0.03ms, 83.4MB)
테스트 3 〉	통과 (0.11ms, 67.3MB)
테스트 4 〉	통과 (0.06ms, 69.8MB)
테스트 5 〉	통과 (0.07ms, 77MB)
테스트 6 〉	통과 (0.03ms, 79.8MB)
테스트 7 〉	통과 (0.09ms, 76.9MB)
테스트 8 〉	통과 (0.17ms, 74.6MB)
테스트 9 〉	통과 (0.10ms, 73.5MB)
테스트 10 〉	통과 (0.08ms, 77.2MB)
테스트 11 〉	통과 (0.11ms, 75.4MB)
테스트 12 〉	통과 (0.22ms, 75.2MB)
테스트 13 〉	통과 (0.02ms, 74.1MB)
테스트 14 〉	통과 (0.03ms, 75.8MB)
테스트 15 〉	통과 (0.13ms, 76.6MB)
테스트 16 〉	통과 (0.04ms, 75.1MB)
테스트 17 〉	통과 (0.15ms, 77.1MB)
테스트 18 〉	통과 (0.07ms, 77MB)
테스트 19 〉	통과 (0.16ms, 76.9MB)
테스트 20 〉	통과 (0.16ms, 77.9MB)
테스트 21 〉	통과 (0.06ms, 74.8MB)
테스트 22 〉	통과 (0.03ms, 69.1MB)
테스트 23 〉	통과 (0.02ms, 73.4MB)
테스트 24 〉	통과 (0.10ms, 75.8MB)
테스트 25 〉	통과 (0.12ms, 76.6MB)
테스트 26 〉	통과 (0.04ms, 72.5MB)
테스트 27 〉	통과 (0.03ms, 75MB)
테스트 28 〉	통과 (0.16ms, 77MB)
 */
public class _121_정수를_나선형으로_배치하기_2 {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    int N;
    public int[][] solution(int n) {
        N = n;
        int[][] answer = new int[n][n];
        int dIdx = 0; //0, 1, 2, 3
        int num = 1;
        int x = 0, y = 0;
        while (num <= n * n) {
            answer[x][y] = num++;
            int _x = x + dx[dIdx];
            int _y = y + dy[dIdx];
            // 방향 전환
            if (isOutside(_x) || isOutside(_y) || answer[_x][_y] > 0) {
                dIdx = (dIdx + 1) % 4;
                _x = x + dx[dIdx];
                _y = y + dy[dIdx];
            }
            x = _x;
            y = _y;
        }
        return answer;
    }

    private boolean isOutside(int x) {
        return x < 0 || x >= N;
    }
}
