package level0;

/*
테스트 1 〉	통과 (0.03ms, 72.3MB)
테스트 2 〉	통과 (0.02ms, 80.1MB)
테스트 3 〉	통과 (0.02ms, 77.6MB)
테스트 4 〉	통과 (0.03ms, 74.5MB)
테스트 5 〉	통과 (0.03ms, 78.9MB)
테스트 6 〉	통과 (0.01ms, 84.1MB)
테스트 7 〉	통과 (0.02ms, 74.7MB)
테스트 8 〉	통과 (0.02ms, 71.9MB)
테스트 9 〉	통과 (0.02ms, 77.5MB)
테스트 10 〉	통과 (0.02ms, 76.1MB)
테스트 11 〉	통과 (0.02ms, 76.3MB)
테스트 12 〉	통과 (0.03ms, 79.1MB)
테스트 13 〉	통과 (0.02ms, 79.1MB)
테스트 14 〉	통과 (0.01ms, 76.6MB)
테스트 15 〉	통과 (0.01ms, 72.4MB)
테스트 16 〉	통과 (0.02ms, 66.3MB)
테스트 17 〉	통과 (0.02ms, 80.6MB)
 */
public class _163_평행 {
    public int solution(int[][] dots) {
        boolean isParallel = isParallel(dots);
        if (!isParallel) {
            swap(dots, 1, 2);
            isParallel = isParallel(dots);
        }
        return isParallel ? 1 : 0;
    }

    private void swap(int[][] dots, int i, int j) {
        int[] tmp = dots[i];
        dots[i] = dots[j];
        dots[j] = tmp;
    }

    private boolean isParallel(int[][] dots) {
        int dx1 = dots[1][0] - dots[0][0];
        int dx2 = dots[3][0] - dots[2][0];
        int dy1 = dots[1][1] - dots[0][1];
        int dy2 = dots[3][1] - dots[2][1];
        //평행조건
        //return dx1 * dy2 == dx2 * dy1;
        return ((float)dx1) / dx2 == ((float)dy1) / dy2;
    }
}
