package level0;

import java.util.stream.IntStream;

/*
테스트 1 〉	통과 (7.59ms, 72.7MB)
테스트 2 〉	통과 (4.19ms, 76.1MB)
테스트 3 〉	통과 (13.83ms, 85.4MB)
테스트 4 〉	통과 (8.28ms, 66.6MB)
테스트 5 〉	통과 (2.18ms, 76.3MB)
테스트 6 〉	통과 (3.70ms, 69.7MB)
테스트 7 〉	통과 (4.49ms, 68.1MB)
테스트 8 〉	통과 (4.48ms, 77.7MB)
테스트 9 〉	통과 (3.25ms, 74MB)
테스트 10 〉	통과 (2.89ms, 75.4MB)
테스트 11 〉	통과 (5.18ms, 75.4MB)
테스트 12 〉	통과 (2.79ms, 71.1MB)
 */
public class _144_약수_구하기_2 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
