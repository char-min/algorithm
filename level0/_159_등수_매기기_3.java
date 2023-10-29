package level0;

import java.util.*;
import java.util.stream.Collectors;

/*
테스트 1 〉	통과 (8.14ms, 72.1MB)
테스트 2 〉	통과 (9.92ms, 73.5MB)
테스트 3 〉	통과 (9.38ms, 77.9MB)
테스트 4 〉	통과 (4.74ms, 72.8MB)
테스트 5 〉	통과 (8.24ms, 72.3MB)
테스트 6 〉	통과 (4.58ms, 83.3MB)
테스트 7 〉	통과 (5.09ms, 78.9MB)
테스트 8 〉	통과 (7.24ms, 76MB)
테스트 9 〉	통과 (4.10ms, 72.3MB)
테스트 10 〉	통과 (4.23ms, 73.3MB)
테스트 11 〉	통과 (4.51ms, 76.3MB)
테스트 12 〉	통과 (4.18ms, 75.8MB)
 */
public class _159_등수_매기기_3 {
    public static void main(String[] args) {
        int[][] score = {{1, 1}};
        int[] answer = solution(score);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[][] score) {
        return Arrays.stream(score)
                .map(ints -> Arrays.stream(score)
                        .map(ints2 -> ints2[0] + ints2[1])
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList())
                        .indexOf(ints[0]+ints[1])+1)
                        .mapToInt(Integer::valueOf)
                        .toArray();
    }
}
