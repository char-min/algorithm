package level0;

import java.util.ArrayList;
import java.util.List;

/*
테스트 1 〉	통과 (0.04ms, 71.1MB)
테스트 2 〉	통과 (3.14ms, 76MB)
테스트 3 〉	통과 (0.04ms, 73.3MB)
테스트 4 〉	통과 (3.18ms, 72.6MB)
테스트 5 〉	통과 (2.88ms, 72.5MB)
테스트 6 〉	통과 (2.01ms, 76.6MB)
테스트 7 〉	통과 (2.18ms, 77.6MB)
테스트 8 〉	통과 (2.55ms, 76.4MB)
테스트 9 〉	통과 (0.07ms, 73.3MB)
테스트 10 〉	통과 (1.95ms, 77.2MB)
테스트 11 〉	통과 (2.61ms, 74.1MB)
테스트 12 〉	통과 (5.36ms, 88.1MB)
테스트 13 〉	통과 (4.79ms, 74.9MB)
테스트 14 〉	통과 (6.49ms, 89.1MB)
테스트 15 〉	통과 (2.93ms, 79.4MB)
테스트 16 〉	통과 (16.84ms, 83.2MB)
테스트 17 〉	통과 (16.38ms, 92.1MB)
테스트 18 〉	통과 (21.99ms, 89.1MB)
테스트 19 〉	통과 (38.32ms, 129MB)
테스트 20 〉	통과 (12.73ms, 89.3MB)
 */
public class _94_배열_만들기_6 {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (!stk.isEmpty() && stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);
            } else {
                stk.add(arr[i]);
            }
        }
        return stk.isEmpty() ? new int[]{-1}
                : stk.stream().mapToInt(Integer::valueOf).toArray();
    }
}
