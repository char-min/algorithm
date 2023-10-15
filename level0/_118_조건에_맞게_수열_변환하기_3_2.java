package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (1.88ms, 78.9MB)
테스트 2 〉	통과 (2.65ms, 74MB)
테스트 3 〉	통과 (1.88ms, 76.2MB)
테스트 4 〉	통과 (1.95ms, 77.2MB)
테스트 5 〉	통과 (1.85ms, 77.1MB)
테스트 6 〉	통과 (1.82ms, 70MB)
테스트 7 〉	통과 (2.09ms, 75MB)
테스트 8 〉	통과 (2.30ms, 77.2MB)
테스트 9 〉	통과 (2.08ms, 77.8MB)
테스트 10 〉	통과 (12.16ms, 162MB)
테스트 11 〉	통과 (5.59ms, 111MB)
 */
public class _118_조건에_맞게_수열_변환하기_3_2 {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(i -> k % 2 == 1 ? i * k : i + k).toArray();
    }
}
