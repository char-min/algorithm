package level0;

/*
테스트 1 〉	통과 (0.04ms, 78.9MB)
테스트 2 〉	통과 (0.02ms, 77.8MB)
테스트 3 〉	통과 (0.04ms, 72.5MB)
테스트 4 〉	통과 (0.02ms, 75.1MB)
테스트 5 〉	통과 (0.04ms, 76.7MB)
테스트 6 〉	통과 (0.03ms, 78.2MB)
테스트 7 〉	통과 (0.03ms, 76.8MB)
테스트 8 〉	통과 (0.05ms, 78.2MB)
테스트 9 〉	통과 (0.03ms, 74.5MB)
테스트 10 〉	통과 (0.06ms, 79.3MB)
테스트 11 〉	통과 (0.03ms, 76.3MB)
테스트 12 〉	통과 (0.04ms, 79.4MB)
테스트 13 〉	통과 (0.02ms, 77.6MB)
테스트 14 〉	통과 (0.01ms, 75.5MB)
테스트 15 〉	통과 (0.06ms, 76.8MB)
테스트 16 〉	통과 (0.04ms, 77.8MB)
테스트 17 〉	통과 (0.04ms, 79.9MB)
테스트 18 〉	통과 (0.03ms, 81MB)
테스트 19 〉	통과 (0.04ms, 80.9MB)
테스트 20 〉	통과 (0.07ms, 74MB)
테스트 21 〉	통과 (0.02ms, 78.9MB)
테스트 22 〉	통과 (0.02ms, 72.7MB)
테스트 23 〉	통과 (0.02ms, 79.1MB)
테스트 24 〉	통과 (0.03ms, 74MB)
테스트 25 〉	통과 (0.04ms, 84.8MB)
테스트 26 〉	통과 (0.03ms, 70.9MB)
테스트 27 〉	통과 (0.02ms, 67.2MB)
테스트 28 〉	통과 (0.05ms, 76.1MB)
 */
public class _121_정수를_나선형으로_배치하기 {
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
