package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.04ms, 88.8MB)
테스트 2 〉	통과 (0.02ms, 80.5MB)
테스트 3 〉	통과 (0.02ms, 80.4MB)
테스트 4 〉	통과 (0.03ms, 72.9MB)
테스트 5 〉	통과 (0.03ms, 81MB)
테스트 6 〉	통과 (0.03ms, 73.1MB)
테스트 7 〉	통과 (0.03ms, 92.7MB)
테스트 8 〉	통과 (0.02ms, 70.4MB)
테스트 9 〉	통과 (0.03ms, 79.1MB)
테스트 10 〉	통과 (0.03ms, 68.2MB)
테스트 11 〉	통과 (0.03ms, 77.8MB)
 */
public class _60_배열_조각하기_2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        StopWatch.start();
        int[] answer = solution(arr, query);
        StopWatch.end(); //2
    }

    public static int[] solution(int[] arr, int[] query) {
        int sIdx = 0; int eIdx = arr.length-1;
        for (int i=0; i<query.length; i++) {
            if (i % 2 == 0) {
                eIdx = i;
            } else {
                sIdx = i;
            }
        }
        return Arrays.copyOfRange(arr, sIdx, eIdx+1);
    }
}
