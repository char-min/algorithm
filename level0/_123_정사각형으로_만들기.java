package level0;

/*
테스트 1 〉	통과 (0.02ms, 75.1MB)
테스트 2 〉	통과 (0.04ms, 76.2MB)
테스트 3 〉	통과 (0.06ms, 78.7MB)
테스트 4 〉	통과 (0.07ms, 82MB)
테스트 5 〉	통과 (0.09ms, 83.4MB)
테스트 6 〉	통과 (0.05ms, 73.8MB)
테스트 7 〉	통과 (0.03ms, 79MB)
테스트 8 〉	통과 (0.07ms, 78.6MB)
테스트 9 〉	통과 (0.11ms, 81.3MB)
테스트 10 〉	통과 (0.14ms, 84.9MB)
테스트 11 〉	통과 (0.13ms, 74.3MB)
테스트 12 〉	통과 (0.06ms, 77MB)
테스트 13 〉	통과 (0.12ms, 81MB)
테스트 14 〉	통과 (0.22ms, 78.6MB)
테스트 15 〉	통과 (0.18ms, 84.3MB)
테스트 16 〉	통과 (0.07ms, 76.8MB)
테스트 17 〉	통과 (0.13ms, 96.1MB)
테스트 18 〉	통과 (0.66ms, 88.2MB)
테스트 19 〉	통과 (0.26ms, 81.3MB)
테스트 20 〉	통과 (0.29ms, 89.8MB)
테스트 21 〉	통과 (0.10ms, 81.7MB)
테스트 22 〉	통과 (0.18ms, 87.3MB)
테스트 23 〉	통과 (0.31ms, 91.1MB)
테스트 24 〉	통과 (0.36ms, 83.8MB)
테스트 25 〉	통과 (0.03ms, 75.8MB)
테스트 26 〉	통과 (0.03ms, 77.6MB)
테스트 27 〉	통과 (0.12ms, 79MB)
테스트 28 〉	통과 (0.34ms, 75.9MB)
테스트 29 〉	통과 (0.46ms, 78.7MB)
 */
public class _123_정사각형으로_만들기 {
    public int[][] solution(int[][] arr) {
        int n = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[n][n];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
