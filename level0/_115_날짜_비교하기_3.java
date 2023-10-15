package level0;

import java.time.LocalDate;
import java.util.Arrays;

/*
테스트 1 〉	통과 (0.03ms, 73.6MB)
테스트 2 〉	통과 (0.02ms, 73.1MB)
테스트 3 〉	통과 (0.03ms, 75.5MB)
테스트 4 〉	통과 (0.02ms, 79.4MB)
테스트 5 〉	통과 (0.04ms, 76MB)
테스트 6 〉	통과 (0.04ms, 81.3MB)
테스트 7 〉	통과 (0.04ms, 78.8MB)
테스트 8 〉	통과 (0.06ms, 75.2MB)
테스트 9 〉	통과 (0.02ms, 78.8MB)
테스트 10 〉	통과 (0.03ms, 76.6MB)
테스트 11 〉	통과 (0.05ms, 76.7MB)
테스트 12 〉	통과 (0.03ms, 71.6MB)
테스트 13 〉	통과 (0.03ms, 75.8MB)
테스트 14 〉	통과 (0.04ms, 74.3MB)
테스트 15 〉	통과 (0.03ms, 75.3MB)
 */
public class _115_날짜_비교하기_3 {
    public int solution(int[] date1, int[] date2) {
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }
}
