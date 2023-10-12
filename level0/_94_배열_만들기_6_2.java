package level0;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
테스트 1 〉	통과 (0.18ms, 71.8MB)
테스트 2 〉	통과 (3.03ms, 68.7MB)
테스트 3 〉	통과 (0.12ms, 74.7MB)
테스트 4 〉	통과 (2.92ms, 72.6MB)
테스트 5 〉	통과 (2.56ms, 71.5MB)
테스트 6 〉	통과 (2.21ms, 74.7MB)
테스트 7 〉	통과 (3.34ms, 72.4MB)
테스트 8 〉	통과 (2.93ms, 67.8MB)
테스트 9 〉	통과 (0.20ms, 73.4MB)
테스트 10 〉	통과 (3.26ms, 76.9MB)
테스트 11 〉	통과 (3.91ms, 77.7MB)
테스트 12 〉	통과 (8.65ms, 75.5MB)
테스트 13 〉	통과 (5.88ms, 78.4MB)
테스트 14 〉	통과 (6.66ms, 82.8MB)
테스트 15 〉	통과 (5.34ms, 78.5MB)
테스트 16 〉	통과 (34.27ms, 82.3MB)
테스트 17 〉	통과 (27.16ms, 88.7MB)
테스트 18 〉	통과 (42.85ms, 85.4MB)
테스트 19 〉	통과 (55.03ms, 126MB)
테스트 20 〉	통과 (14.31ms, 89.4MB)
 */
public class _94_배열_만들기_6_2 {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int i=0; i<arr.length; i++) {
            if (!stk.isEmpty() && stk.peek() == arr[i]) {
                stk.pop();
            } else {
                stk.push(arr[i]);
            }
        }
        return stk.isEmpty() ? new int[]{-1} : stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
