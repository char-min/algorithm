package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.09ms, 76.5MB)
테스트 2 〉	통과 (0.10ms, 78.6MB)
테스트 3 〉	통과 (0.12ms, 70.3MB)
테스트 4 〉	통과 (0.09ms, 82.3MB)
테스트 5 〉	통과 (0.08ms, 71.8MB)
테스트 6 〉	통과 (0.11ms, 75.1MB)
테스트 7 〉	통과 (0.09ms, 73.2MB)
테스트 8 〉	통과 (0.12ms, 80.7MB)
테스트 9 〉	통과 (0.09ms, 77MB)
테스트 10 〉	통과 (0.19ms, 84.8MB)
테스트 11 〉	통과 (0.15ms, 72.1MB)
테스트 12 〉	통과 (0.23ms, 78.5MB)
테스트 13 〉	통과 (0.20ms, 81.5MB)
테스트 14 〉	통과 (0.13ms, 78.2MB)
테스트 15 〉	통과 (0.14ms, 77.6MB)
테스트 16 〉	통과 (0.50ms, 81.4MB)
테스트 17 〉	통과 (0.42ms, 75.3MB)
테스트 18 〉	통과 (0.41ms, 78.4MB)
테스트 19 〉	통과 (0.14ms, 86MB)
테스트 20 〉	통과 (0.20ms, 76.1MB)
 */
public class _95_무작위로_K개의_수_뽑기 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int idx = 0;
        boolean[] tmp = new boolean[100_001];
        for (int i=0; i<arr.length; i++) {
            if (!tmp[arr[i]]) {
                answer[idx++] = arr[i];
                tmp[arr[i]] = true;
            }
            if (idx == k) {
                break;
            }
        }
        return answer;
    }
}
