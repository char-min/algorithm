package level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
테스트 1 〉	통과 (0.78ms, 76.9MB)
테스트 2 〉	통과 (2.98ms, 74.5MB)
테스트 3 〉	통과 (5.69ms, 105MB)
테스트 4 〉	통과 (7.55ms, 94.6MB)
테스트 5 〉	통과 (8.02ms, 103MB)
테스트 6 〉	통과 (3.61ms, 82.9MB)
테스트 7 〉	통과 (7.10ms, 95.3MB)
테스트 8 〉	통과 (9.04ms, 100MB)
테스트 9 〉	통과 (5.75ms, 96.2MB)
테스트 10 〉	통과 (10.17ms, 109MB)
테스트 11 〉	통과 (10.47ms, 77.6MB)
테스트 12 〉	통과 (6.82ms, 92.2MB)
테스트 13 〉	통과 (4.54ms, 82.8MB)
테스트 14 〉	통과 (6.76ms, 104MB)
 */
public class _59_2의_영역 {
    public static void main(String[] args) {
        int[] arr = new int[1000_000];
        for (int i=0, j=1; i<1000_000; i++) {
            arr[i] = j;
            j = j > 10 ? 1 : j+1;
        }
        StopWatch.start();
        int[] answer = solution(arr);
        StopWatch.end(); //67
        //System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] arr) {
        int[] answer;
        int sIdx = -1, eIdx = -1;
        List<Integer> answerList = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                if (sIdx == -1) {
                    sIdx = i;
                } else {
                    eIdx = i;
                }
            }
        }
        if (sIdx == -1) {
            answer = new int[]{-1};
        } else {
            eIdx = eIdx == -1 ? sIdx : eIdx;
            answer = IntStream.rangeClosed(sIdx, eIdx).map(i -> arr[i]).toArray();
        }
        return answer;
    }
}
