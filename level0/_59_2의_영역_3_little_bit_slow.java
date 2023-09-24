package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
테스트 1 〉	통과 (2.32ms, 85.4MB)
테스트 2 〉	통과 (3.52ms, 79.9MB)
테스트 3 〉	통과 (6.31ms, 96MB)
테스트 4 〉	통과 (5.95ms, 108MB)
테스트 5 〉	통과 (8.19ms, 106MB)
테스트 6 〉	통과 (3.72ms, 91.7MB)
테스트 7 〉	통과 (5.26ms, 89.7MB)
테스트 8 〉	통과 (5.34ms, 99.7MB)
테스트 9 〉	통과 (3.72ms, 93.6MB)
테스트 10 〉	통과 (6.61ms, 99.6MB)
테스트 11 〉	통과 (5.04ms, 93.3MB)
테스트 12 〉	통과 (5.45ms, 112MB)
테스트 13 〉	통과 (3.23ms, 81.3MB)
테스트 14 〉	통과 (5.55ms, 93.3MB)
 */
public class _59_2의_영역_3_little_bit_slow {
    public static void main(String[] args) {
        int[] arr = new int[1000_000];
        for (int i=0, j=1; i<1000_000; i++) {
            arr[i] = j;
            j = j > 10 ? 1 : j+1;
        }
        StopWatch.start();
        int[] answer = solution(arr);
        StopWatch.end(); //82
        //System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] arr) {
        int sIdx = -1, eIdx = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                sIdx = i;
                break;
            }
        }

        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] == 2) {
                eIdx = i;
                break;
            }
        }

        if (sIdx == -1) {
            return new int[]{-1};
        } else {
            return IntStream.rangeClosed(sIdx, eIdx).map(i -> arr[i]).toArray();
        }
    }
}
