package level0;

import java.util.LinkedList;
import java.util.List;

/*
테스트 1 〉	통과 (2.34ms, 75.8MB)
테스트 2 〉	통과 (2.14ms, 75.8MB)
테스트 3 〉	통과 (3.24ms, 77.1MB)
테스트 4 〉	통과 (2.18ms, 79.3MB)
테스트 5 〉	통과 (2.27ms, 74.2MB)
테스트 6 〉	통과 (3.22ms, 78.3MB)
테스트 7 〉	통과 (3.81ms, 74.5MB)
테스트 8 〉	통과 (2.11ms, 75.6MB)
테스트 9 〉	통과 (2.15ms, 74.1MB)
테스트 10 〉	통과 (3.20ms, 74MB)
테스트 11 〉	통과 (3.15ms, 80.5MB)
테스트 12 〉	통과 (2.67ms, 74.8MB)
 */
public class _144_약수_구하기 {
    public int[] solution(int n) {
        List<Integer> answerList = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                answerList.add(i);
            }
        }
        return answerList.stream().mapToInt(Integer::valueOf).toArray();
    }
}
