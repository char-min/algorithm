package level0;

/*
테스트 1 〉	통과 (0.03ms, 74.5MB)
테스트 2 〉	통과 (0.02ms, 78.3MB)
테스트 3 〉	통과 (0.01ms, 71MB)
테스트 4 〉	통과 (0.03ms, 79.6MB)
테스트 5 〉	통과 (0.03ms, 64.2MB)
테스트 6 〉	통과 (0.02ms, 77MB)
테스트 7 〉	통과 (0.11ms, 67.2MB)
테스트 8 〉	통과 (0.03ms, 75.2MB)
테스트 9 〉	통과 (0.02ms, 75.8MB)
 */
public class _123_이차원_배열_대각선_순회하기 {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                answer += i + j <= k ? board[i][j] : 0;
            }
        }
        return answer;
    }
}
