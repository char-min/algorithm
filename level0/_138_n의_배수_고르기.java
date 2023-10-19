package level0;

import java.util.ArrayList;
import java.util.List;

/*
테스트 1 〉	통과 (5.73ms, 67.7MB)
테스트 2 〉	통과 (2.36ms, 78.5MB)
테스트 3 〉	통과 (2.44ms, 78.7MB)
테스트 4 〉	통과 (1.85ms, 77MB)
테스트 5 〉	통과 (3.51ms, 73.7MB)
테스트 6 〉	통과 (2.05ms, 74MB)
테스트 7 〉	통과 (1.90ms, 72.7MB)
테스트 8 〉	통과 (2.08ms, 75.9MB)
 */
public class _138_n의_배수_고르기 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answerList = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                answerList.add(num);
            }
        }
        return answerList.stream().mapToInt(Integer::valueOf).toArray();
    }
}
