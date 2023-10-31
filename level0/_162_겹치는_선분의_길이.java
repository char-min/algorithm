package level0;

/*
테스트 1 〉	통과 (0.02ms, 79.3MB)
테스트 2 〉	통과 (0.04ms, 75.8MB)
테스트 3 〉	통과 (0.02ms, 70.2MB)
테스트 4 〉	통과 (0.04ms, 75.9MB)
테스트 5 〉	통과 (0.02ms, 72.7MB)
테스트 6 〉	통과 (0.04ms, 77.2MB)
테스트 7 〉	통과 (0.03ms, 72.9MB)
테스트 8 〉	통과 (0.03ms, 72.5MB)
테스트 9 〉	통과 (0.03ms, 83.5MB)
테스트 10 〉	통과 (0.03ms, 78.9MB)
 */
public class _162_겹치는_선분의_길이 {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] cntArr = new int[200];
        for (int[] line : lines) {
            int s = line[0] + 100;
            int e = line[1] + 100;
            for (int i=s; i<e; i++) {
                cntArr[i]++;
            }
        }
        for (int cnt : cntArr) {
            if (cnt > 1) {
                answer++;
            }
        }
        return answer;
    }
}
