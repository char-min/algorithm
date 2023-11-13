package level0;

import java.util.*;

/*
테스트 1 〉	통과 (0.56ms, 71.5MB)
테스트 2 〉	통과 (1.11ms, 75.7MB)
테스트 3 〉	통과 (0.34ms, 76MB)
테스트 4 〉	통과 (0.47ms, 74.2MB)
테스트 5 〉	통과 (0.35ms, 74.3MB)
테스트 6 〉	통과 (0.37ms, 73.1MB)
테스트 7 〉	통과 (0.33ms, 74MB)
테스트 8 〉	통과 (0.40ms, 69.6MB)
테스트 9 〉	통과 (0.59ms, 72.2MB)
테스트 10 〉	통과 (0.32ms, 77.2MB)
테스트 11 〉	통과 (0.33ms, 74.3MB)
테스트 12 〉	통과 (0.38ms, 74.6MB)
 */
public class _170_최댓값_만들기_2 {
    public int solution(int[] numbers) {
        List<Integer> nonNegatives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        for (int number : numbers) {
            if (number >= 0) {
                nonNegatives.add(number);
            } else {
                negatives.add(number);
            }
        }
        Collections.sort(nonNegatives, Collections.reverseOrder());
        Collections.sort(negatives);
        if (nonNegatives.size() == 1 && negatives.size() == 1) {
            return nonNegatives.get(0) * negatives.get(0);
        }
        int max = Integer.MIN_VALUE;
        if (nonNegatives.size() >= 2) {
            max = Math.max(max, nonNegatives.get(0) * nonNegatives.get(1));
        }
        if (negatives.size() >= 2) {
            max = Math.max(max, negatives.get(0) * negatives.get(1));
        }
        return max;
    }
}
