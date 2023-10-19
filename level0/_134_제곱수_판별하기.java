package level0;

/*
테스트 1 〉	통과 (0.37ms, 78.3MB)
테스트 2 〉	통과 (0.20ms, 76.8MB)
테스트 3 〉	통과 (0.20ms, 74.9MB)
테스트 4 〉	통과 (0.28ms, 75.9MB)
테스트 5 〉	통과 (0.21ms, 72.8MB)
테스트 6 〉	통과 (0.21ms, 74MB)
테스트 7 〉	통과 (0.24ms, 77.6MB)
테스트 8 〉	통과 (0.25ms, 81MB)
테스트 9 〉	통과 (0.35ms, 74.9MB)
테스트 10 〉	통과 (0.21ms, 77.3MB)
 */
public class _134_제곱수_판별하기 {
    public int solution(int n) {
        double squareRoot = Math.sqrt(n);
        return squareRoot > Math.floor(squareRoot) ? 2 : 1;
    }
}
