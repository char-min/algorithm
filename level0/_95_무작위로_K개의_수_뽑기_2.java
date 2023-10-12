package level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
테스트 1 〉	통과 (0.06ms, 79.4MB)
테스트 2 〉	통과 (0.08ms, 75.1MB)
테스트 3 〉	통과 (0.07ms, 84.3MB)
테스트 4 〉	통과 (0.09ms, 78MB)
테스트 5 〉	통과 (0.05ms, 73.5MB)
테스트 6 〉	통과 (0.08ms, 73.2MB)
테스트 7 〉	통과 (0.37ms, 76.8MB)
테스트 8 〉	통과 (0.29ms, 74.5MB)
테스트 9 〉	통과 (0.21ms, 77MB)
테스트 10 〉	통과 (2.01ms, 78MB)
테스트 11 〉	통과 (0.49ms, 70.6MB)
테스트 12 〉	통과 (0.55ms, 72.1MB)
테스트 13 〉	통과 (0.74ms, 80.1MB)
테스트 14 〉	통과 (0.70ms, 78.9MB)
테스트 15 〉	통과 (0.63ms, 78.6MB)
테스트 16 〉	통과 (1.39ms, 84.7MB)
테스트 17 〉	통과 (1.82ms, 85.2MB)
테스트 18 〉	통과 (1.10ms, 77.2MB)
테스트 19 〉	통과 (0.45ms, 92.8MB)
테스트 20 〉	통과 (1.08ms, 77.3MB)
 */
public class _95_무작위로_K개의_수_뽑기_2 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        Set<Integer> arrSet = new HashSet<>();
        int idx = 0;
        for (int i=0; i<arr.length; i++) {
            if (!arrSet.contains(arr[i])) {
                arrSet.add(arr[i]);
                answer[idx++] = arr[i];
            }
            if (arrSet.size() == k) {
                break;
            }
        }
        return answer;
    }
}
