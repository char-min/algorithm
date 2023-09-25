package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.02ms, 77.5MB)
테스트 2 〉	통과 (0.02ms, 83.3MB)
테스트 3 〉	통과 (0.02ms, 80.7MB)
테스트 4 〉	통과 (0.03ms, 67.4MB)
테스트 5 〉	통과 (0.02ms, 78.4MB)
테스트 6 〉	통과 (0.02ms, 76.6MB)
테스트 7 〉	통과 (0.02ms, 72MB)
테스트 8 〉	통과 (0.02ms, 85.1MB)
테스트 9 〉	통과 (0.01ms, 77.9MB)
테스트 10 〉	통과 (0.06ms, 76.9MB)
테스트 11 〉	통과 (0.04ms, 80.3MB)
테스트 12 〉	통과 (0.03ms, 74.1MB)
테스트 13 〉	통과 (0.02ms, 76.3MB)
테스트 14 〉	통과 (0.03ms, 75.7MB)
테스트 15 〉	통과 (0.03ms, 77.8MB)
테스트 16 〉	통과 (0.03ms, 76.2MB)
테스트 17 〉	통과 (0.02ms, 83.1MB)
테스트 18 〉	통과 (0.03ms, 68.1MB)
테스트 19 〉	통과 (0.03ms, 72.6MB)
테스트 20 〉	통과 (0.04ms, 81.4MB)
 */
public class _61_n_번째_원소부터_2 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = Arrays.copyOfRange(num_list, n-1, num_list.length);
        return answer;
    }
}
