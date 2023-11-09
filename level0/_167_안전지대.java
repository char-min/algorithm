package level0;

public class _167_안전지대 {
    boolean[][] isChecked;
    int answer;
    public int solution(int[][] board) {
        isChecked = new boolean[board.length][board[0].length];
        answer = 0;
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (!isChecked[i][j] && board[i][j] == 1) {
                    check(i, j);
                }
            }
        }

        return board.length * board[0].length - answer;
    }

    private void check(int i, int j) {
        for (int x=i-1; x<i+1; x++) {
            for (int y=j-1; y<j+1; y++) {
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
