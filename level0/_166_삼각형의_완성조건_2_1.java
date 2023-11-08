package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.03ms, 76MB)
테스트 2 〉	통과 (0.05ms, 75.5MB)
테스트 3 〉	통과 (0.02ms, 80.1MB)
테스트 4 〉	통과 (0.04ms, 74.5MB)
테스트 5 〉	통과 (0.03ms, 72MB)
테스트 6 〉	통과 (0.02ms, 73.1MB)
테스트 7 〉	통과 (0.03ms, 77.4MB)
테스트 8 〉	통과 (0.04ms, 79.6MB)
테스트 9 〉	통과 (0.02ms, 73.7MB)
테스트 10 〉	통과 (0.02ms, 76.7MB)
 */
public class _166_삼각형의_완성조건_2_1 {
    public int solution(int[] sides) {
        int min = Math.min(sides[0], sides[1]);
        return 2 * min - 1;
    }
}
