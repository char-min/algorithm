package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.93ms, 86.7MB)
테스트 2 〉	통과 (1.06ms, 74.6MB)
테스트 3 〉	통과 (0.27ms, 80.3MB)
테스트 4 〉	통과 (0.17ms, 77.9MB)
테스트 5 〉	통과 (0.21ms, 86.5MB)
테스트 6 〉	통과 (0.40ms, 80.3MB)
테스트 7 〉	통과 (0.62ms, 79.9MB)
테스트 8 〉	통과 (0.27ms, 77MB)
테스트 9 〉	통과 (0.30ms, 79MB)
테스트 10 〉	통과 (0.13ms, 72MB)
테스트 11 〉	통과 (0.11ms, 70.7MB)
 */
public class _60_배열_조각하기 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        StopWatch.start();
        int[] answer = solution(arr, query);
        StopWatch.end(); //2
    }

    public static int[] solution(int[] arr, int[] query) {
        for (int i=0; i<query.length; i++) {
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}
