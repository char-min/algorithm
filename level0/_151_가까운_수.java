package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.35ms, 73.6MB)
테스트 2 〉	통과 (0.39ms, 79MB)
테스트 3 〉	통과 (0.46ms, 76.4MB)
테스트 4 〉	통과 (0.58ms, 76.3MB)
테스트 5 〉	통과 (0.33ms, 77.2MB)
테스트 6 〉	통과 (0.39ms, 76.8MB)
테스트 7 〉	통과 (0.35ms, 69MB)
테스트 8 〉	통과 (0.39ms, 74.9MB)
테스트 9 〉	통과 (0.35ms, 74.2MB)
테스트 10 〉	통과 (0.37ms, 75.9MB)
테스트 11 〉	통과 (0.37ms, 74.2MB)
테스트 12 〉	통과 (0.42ms, 73.7MB)
테스트 13 〉	통과 (0.39ms, 74.3MB)
테스트 14 〉	통과 (0.38ms, 76.9MB)
테스트 15 〉	통과 (0.40ms, 75.7MB)
테스트 16 〉	통과 (0.37ms, 85.9MB)
테스트 17 〉	통과 (0.37ms, 71.7MB)
테스트 18 〉	통과 (0.41ms, 77.1MB)
 */
public class _151_가까운_수 {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int min = Integer.MAX_VALUE;
        int answer = 0;
        for (int i=0; i<array.length; i++) {
            int diff = Math.abs(n - array[i]);
            if (min > diff) {
                min = diff;
                answer = array[i];
            }
        }
        return answer;
    }
}
