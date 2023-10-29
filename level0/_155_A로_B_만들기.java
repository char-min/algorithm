package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.39ms, 69.7MB)
테스트 2 〉	통과 (1.04ms, 71.3MB)
테스트 3 〉	통과 (0.36ms, 73.2MB)
테스트 4 〉	통과 (0.52ms, 77.9MB)
테스트 5 〉	통과 (1.17ms, 77.7MB)
테스트 6 〉	통과 (0.34ms, 72.2MB)
테스트 7 〉	통과 (0.46ms, 78.9MB)
테스트 8 〉	통과 (0.51ms, 75.3MB)
테스트 9 〉	통과 (0.49ms, 77MB)
테스트 10 〉	통과 (0.43ms, 77.4MB)
테스트 11 〉	통과 (1.11ms, 73.7MB)
테스트 12 〉	통과 (0.77ms, 75.8MB)
테스트 13 〉	통과 (0.38ms, 74.4MB)
테스트 14 〉	통과 (0.54ms, 78.2MB)
테스트 15 〉	통과 (0.46ms, 73.9MB)
테스트 16 〉	통과 (0.79ms, 75.5MB)
테스트 17 〉	통과 (0.78ms, 72.7MB)
테스트 18 〉	통과 (0.69ms, 72MB)
테스트 19 〉	통과 (0.93ms, 76.6MB)
테스트 20 〉	통과 (0.70ms, 77.6MB)
테스트 21 〉	통과 (0.67ms, 77.5MB)
테스트 22 〉	통과 (0.34ms, 75.4MB)
테스트 23 〉	통과 (0.37ms, 73.1MB)
 */
public class _155_A로_B_만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        return Arrays.equals(beforeArray, afterArray) ? 1 : 0;
    }
}
