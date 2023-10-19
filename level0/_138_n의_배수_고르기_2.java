package level0;

import java.util.stream.IntStream;

/*
테스트 1 〉	통과 (2.15ms, 76.9MB)
테스트 2 〉	통과 (4.13ms, 72.5MB)
테스트 3 〉	통과 (2.69ms, 77.1MB)
테스트 4 〉	통과 (2.93ms, 74MB)
테스트 5 〉	통과 (2.10ms, 72.9MB)
테스트 6 〉	통과 (1.98ms, 73.7MB)
테스트 7 〉	통과 (2.17ms, 74MB)
테스트 8 〉	통과 (2.32ms, 67.8MB)
 */
public class _138_n의_배수_고르기_2 {
    public int[] solution(int n, int[] numlist) {
        return IntStream.of(numlist).filter(num -> num % n == 0).toArray();
    }
}
