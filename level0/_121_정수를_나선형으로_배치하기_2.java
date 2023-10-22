package level0;

public class _121_정수를_나선형으로_배치하기_2 {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int dIdx = 0; //0, 1, 2, 3
        int[] crrLoc = {0, 0};
        int num = 1;
        answer[0][0] = num++;
        int end = n;
        int start = 0;
        while (!(n % 2 == 1 && crrLoc[0] == n / 2 && crrLoc[1] == n / 2
                || n % 2 == 0 && crrLoc[0] == n / 2 && crrLoc[1] == n / 2 - 1)) {
            if (dIdx == 0) {
                end--;
                for (int j=crrLoc[1]+1; j<=end; j++) {
                    answer[crrLoc[0]][j] = num++;
                    crrLoc[1] = j;
                }
            } else if (dIdx == 1) {
                for (int i=crrLoc[0]+1; i<=end; i++) {
                    answer[i][crrLoc[1]] = num++;
                    crrLoc[0] = i;
                }
            } else if (dIdx == 2) {
                for (int j=crrLoc[1]-1; j>=start; j--) {
                    answer[crrLoc[0]][j] = num++;
                    crrLoc[1] = j;
                }
            } else {
                start++;
                for (int i=crrLoc[0]-1; i>=start; i--) {
                    answer[i][crrLoc[1]] = num++;
                    crrLoc[0] = i;
                }
            }
            dIdx = (dIdx + 1) % 4;
        }
        return answer;
    }
}
