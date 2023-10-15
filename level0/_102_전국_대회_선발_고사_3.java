package level0;

import java.util.stream.IntStream;

/*
테스트 1 〉	통과 (3.79ms, 76.6MB)
테스트 2 〉	통과 (3.16ms, 77.1MB)
테스트 3 〉	통과 (5.09ms, 76.6MB)
테스트 4 〉	통과 (3.02ms, 73.6MB)
테스트 5 〉	통과 (6.65ms, 72.7MB)
테스트 6 〉	통과 (3.97ms, 81.8MB)
테스트 7 〉	통과 (4.26ms, 75.7MB)
테스트 8 〉	통과 (4.20ms, 75.8MB)
테스트 9 〉	통과 (3.83ms, 78MB)
테스트 10 〉	통과 (3.79ms, 67.8MB)
테스트 11 〉	통과 (4.25ms, 77.8MB)
테스트 12 〉	통과 (3.83ms, 69.9MB)
테스트 13 〉	통과 (9.59ms, 75.9MB)
테스트 14 〉	통과 (8.67ms, 79.3MB)
테스트 15 〉	통과 (11.20ms, 82.3MB)
테스트 16 〉	통과 (3.46ms, 70.9MB)
테스트 17 〉	통과 (11.68ms, 77.6MB)
테스트 18 〉	통과 (3.88ms, 74.9MB)
테스트 19 〉	통과 (3.69ms, 78.6MB)
 */
public class _102_전국_대회_선발_고사_3 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        int answer = solution(rank, attendance);
        System.out.println(answer);
    }

    public static int solution(int[] rank, boolean[] attendance) {
        return IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted((i1, i2) -> rank[i1] - rank[i2])
                .limit(3)
                .reduce((current, next) -> 100 * current + next)
                .get();
    }
}
