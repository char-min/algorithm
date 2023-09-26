package level0;

/*
테스트 1 〉	통과 (0.02ms, 81.8MB)
테스트 2 〉	통과 (0.02ms, 77MB)
테스트 3 〉	통과 (0.03ms, 76.3MB)
테스트 4 〉	통과 (0.03ms, 76.9MB)
테스트 5 〉	통과 (0.02ms, 78.4MB)
테스트 6 〉	통과 (0.03ms, 78.4MB)
테스트 7 〉	통과 (0.02ms, 73.8MB)
테스트 8 〉	통과 (0.02ms, 75.1MB)
테스트 9 〉	통과 (0.03ms, 73MB)
테스트 10 〉	통과 (0.02ms, 76.8MB)
테스트 11 〉	통과 (0.02ms, 72.6MB)
테스트 12 〉	통과 (0.02ms, 77.2MB)
 */
public class _69_n보다_커질_때까지_더하기 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            answer += number;
            if (answer > n) {
                break;
            }
        }
        return answer;
    }
}
