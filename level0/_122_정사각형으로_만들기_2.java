package level0;

/*
테스트 1 〉	통과 (0.03ms, 81.2MB)
테스트 2 〉	통과 (0.04ms, 83.7MB)
테스트 3 〉	통과 (0.03ms, 77.3MB)
테스트 4 〉	통과 (0.04ms, 80MB)
테스트 5 〉	통과 (0.06ms, 88.6MB)
테스트 6 〉	통과 (0.04ms, 74.3MB)
테스트 7 〉	통과 (0.05ms, 76.2MB)
테스트 8 〉	통과 (0.03ms, 76.7MB)
테스트 9 〉	통과 (0.07ms, 90MB)
테스트 10 〉	통과 (0.08ms, 83.2MB)
테스트 11 〉	통과 (0.07ms, 74.1MB)
테스트 12 〉	통과 (0.05ms, 75.8MB)
테스트 13 〉	통과 (0.04ms, 75MB)
테스트 14 〉	통과 (0.07ms, 86.8MB)
테스트 15 〉	통과 (0.07ms, 85.1MB)
테스트 16 〉	통과 (0.05ms, 83.8MB)
테스트 17 〉	통과 (0.07ms, 84.1MB)
테스트 18 〉	통과 (0.09ms, 95MB)
테스트 19 〉	통과 (0.08ms, 80.1MB)
테스트 20 〉	통과 (0.09ms, 80MB)
테스트 21 〉	통과 (0.05ms, 78.7MB)
테스트 22 〉	통과 (0.07ms, 84.6MB)
테스트 23 〉	통과 (0.06ms, 83.4MB)
테스트 24 〉	통과 (0.07ms, 84.2MB)
테스트 25 〉	통과 (0.05ms, 66.2MB)
테스트 26 〉	통과 (0.05ms, 79.5MB)
테스트 27 〉	통과 (0.08ms, 74MB)
테스트 28 〉	통과 (0.06ms, 88MB)
테스트 29 〉	통과 (0.10ms, 77.2MB)
 */
public class _122_정사각형으로_만들기_2 {
    public int[][] solution(int[][] arr) {
        int n = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[n][n];
        for (int i=0; i<arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[0].length);
        }
        return answer;
    }
}
