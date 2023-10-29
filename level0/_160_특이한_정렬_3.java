package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (3.35ms, 74.1MB)
테스트 2 〉	통과 (4.95ms, 77.7MB)
테스트 3 〉	통과 (5.93ms, 77.7MB)
테스트 4 〉	통과 (4.64ms, 76.3MB)
테스트 5 〉	통과 (4.93ms, 79.3MB)
테스트 6 〉	통과 (3.93ms, 74.9MB)
테스트 7 〉	통과 (4.23ms, 75.6MB)
 */
public class _160_특이한_정렬_3 {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
