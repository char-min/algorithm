package level0;

/*
테스트 1 〉	통과 (0.02ms, 77.9MB)
테스트 2 〉	통과 (0.02ms, 73.6MB)
테스트 3 〉	통과 (0.03ms, 79.7MB)
테스트 4 〉	통과 (0.02ms, 72.4MB)
테스트 5 〉	통과 (0.03ms, 77.3MB)
테스트 6 〉	통과 (0.02ms, 75.2MB)
테스트 7 〉	통과 (0.02ms, 77.8MB)
테스트 8 〉	통과 (0.02ms, 74.2MB)
테스트 9 〉	통과 (0.02ms, 73.9MB)
테스트 10 〉	통과 (0.01ms, 76.3MB)
테스트 11 〉	통과 (0.01ms, 71.6MB)
테스트 12 〉	통과 (0.01ms, 73.4MB)
 */
public class _69_n보다_커질_때까지_더하기_2 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i=0; answer<=n; i++) {
            answer += numbers[i];
        }
        return answer;
    }
}
