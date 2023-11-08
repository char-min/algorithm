package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.53ms, 79MB)
테스트 2 〉	통과 (0.50ms, 73.6MB)
테스트 3 〉	통과 (0.47ms, 77.4MB)
테스트 4 〉	통과 (0.50ms, 71.6MB)
테스트 5 〉	통과 (0.50ms, 72.2MB)
테스트 6 〉	통과 (0.36ms, 66.3MB)
테스트 7 〉	통과 (0.37ms, 74MB)
테스트 8 〉	통과 (0.59ms, 78.8MB)
테스트 9 〉	통과 (0.48ms, 79.1MB)
테스트 10 〉	통과 (0.49ms, 77.3MB)
 */
public class _166_삼각형의_완성조건_2 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int s = sides[1] - sides[0];
        int e = sides[0] + sides[1];
        return e - s - 1;
    }
}
