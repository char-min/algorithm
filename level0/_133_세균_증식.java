package level0;

/*
테스트 1 〉	통과 (0.03ms, 73.7MB)
테스트 2 〉	통과 (0.03ms, 74.8MB)
테스트 3 〉	통과 (0.02ms, 80.6MB)
테스트 4 〉	통과 (0.02ms, 79MB)
테스트 5 〉	통과 (0.02ms, 75.9MB)
테스트 6 〉	통과 (0.03ms, 76.1MB)
테스트 7 〉	통과 (0.02ms, 76MB)
테스트 8 〉	통과 (0.04ms, 70MB)
 */
public class _133_세균_증식 {
    public int solution(int n, int t) {
        int answer = n;
        while (t > 0) {
            answer *= 2;
            t--;
        }
        return answer;
    }
}
