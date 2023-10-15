package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.01ms, 78.3MB)
테스트 2 〉	통과 (0.01ms, 74.4MB)
테스트 3 〉	통과 (0.02ms, 81.5MB)
테스트 4 〉	통과 (0.02ms, 76.6MB)
테스트 5 〉	통과 (0.01ms, 77.4MB)
테스트 6 〉	통과 (0.02ms, 73.6MB)
테스트 7 〉	통과 (0.03ms, 79.5MB)
테스트 8 〉	통과 (0.04ms, 76.3MB)
테스트 9 〉	통과 (0.02ms, 82.4MB)
테스트 10 〉	통과 (5.23ms, 173MB)
테스트 11 〉	통과 (1.28ms, 112MB)
 */
public class _118_조건에_맞게_수열_변환하기_3 {
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 1) {
            for (int i=0; i<arr.length; i++) {
                arr[i] *= k;
            }
        } else {
            for (int i=0; i<arr.length; i++) {
                arr[i] += k;
            }
        }
        return arr;
    }
}
