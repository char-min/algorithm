package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
테스트 1 〉	통과 (0.39ms, 75.2MB)
테스트 2 〉	통과 (0.32ms, 75.2MB)
테스트 3 〉	통과 (0.37ms, 84.2MB)
테스트 4 〉	통과 (0.34ms, 75.4MB)
테스트 5 〉	통과 (0.37ms, 75.4MB)
테스트 6 〉	통과 (0.34ms, 77.3MB)
테스트 7 〉	통과 (0.38ms, 72.8MB)
테스트 8 〉	통과 (0.37ms, 74.6MB)
테스트 9 〉	통과 (0.47ms, 74.7MB)
테스트 10 〉	통과 (0.52ms, 78.8MB)
테스트 11 〉	통과 (0.40ms, 76MB)
테스트 12 〉	통과 (0.35ms, 72.8MB)
 */
public class _170_최댓값_만들기_2_2 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length-1] * numbers[numbers.length-2]);
    }
}
