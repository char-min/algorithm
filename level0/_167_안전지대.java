package level0;

/*
테스트 1 〉	통과 (0.03ms, 71.7MB)
테스트 2 〉	통과 (0.04ms, 78.6MB)
테스트 3 〉	통과 (0.06ms, 74.1MB)
테스트 4 〉	통과 (0.03ms, 79.7MB)
테스트 5 〉	통과 (0.03ms, 66.4MB)
테스트 6 〉	통과 (0.04ms, 86.2MB)
테스트 7 〉	통과 (0.04ms, 73.2MB)
테스트 8 〉	통과 (0.03ms, 74.8MB)
테스트 9 〉	통과 (0.03ms, 72MB)
테스트 10 〉	통과 (0.04ms, 75.3MB)
테스트 11 〉	통과 (0.03ms, 76.7MB)
테스트 12 〉	통과 (0.02ms, 76MB)
테스트 13 〉	통과 (0.03ms, 73.4MB)
테스트 14 〉	통과 (0.07ms, 83.7MB)
 */
public class _167_안전지대 {
    boolean[][] isChecked;
    int answer;
    public int solution(int[][] board) {
        isChecked = new boolean[board.length][board[0].length];
        answer = 0;
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] == 1) {
                    check(i, j);
                }
            }
        }

        return board.length * board[0].length - answer;
    }

    private void check(int i, int j) {
        for (int x=i-1; x<=i+1; x++) {
            for (int y=j-1; y<=j+1; y++) {
                if (isOutside(x, y) || isChecked[x][y]) {
                    continue;
                }
                isChecked[x][y] = true;
                answer++;
            }
        }
    }

    private boolean isOutside(int x, int y) {
        if (x < 0 || x >= isChecked.length
                || y < 0 || y >= isChecked[0].length) {
            return true;
        }
        return false;
    }
}
