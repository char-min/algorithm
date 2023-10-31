package level0;

import java.util.HashMap;
import java.util.Map;

/*
테스트 1 〉	통과 (1.68ms, 88.3MB)
테스트 2 〉	통과 (1.79ms, 81.6MB)
테스트 3 〉	통과 (1.53ms, 86.9MB)
테스트 4 〉	통과 (2.02ms, 69.9MB)
테스트 5 〉	통과 (2.08ms, 80.3MB)
테스트 6 〉	통과 (1.24ms, 81.9MB)
테스트 7 〉	통과 (1.46ms, 70.7MB)
테스트 8 〉	통과 (1.78ms, 74.7MB)
테스트 9 〉	통과 (1.17ms, 73.3MB)
테스트 10 〉	통과 (0.95ms, 72.6MB)
 */
public class _162_겹치는_선분의_길이_2 {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] line : lines) {
            int s = line[0];
            int e = line[1];
            for (int i=s; i<e; i++) {
                map.merge(i, 1, Integer::sum);
            }
        }
        return (int)map.values().stream().filter(cnt -> cnt > 1).count();
    }
}
