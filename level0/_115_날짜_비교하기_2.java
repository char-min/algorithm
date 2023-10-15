package level0;

import java.time.LocalDate;

/*
테스트 1 〉	통과 (0.66ms, 71.7MB)
테스트 2 〉	통과 (0.65ms, 73.7MB)
테스트 3 〉	통과 (0.69ms, 74.8MB)
테스트 4 〉	통과 (1.04ms, 76.4MB)
테스트 5 〉	통과 (0.69ms, 81.4MB)
테스트 6 〉	통과 (0.94ms, 74.9MB)
테스트 7 〉	통과 (0.77ms, 73.8MB)
테스트 8 〉	통과 (1.01ms, 73.6MB)
테스트 9 〉	통과 (0.66ms, 75.3MB)
테스트 10 〉	통과 (0.73ms, 78.1MB)
테스트 11 〉	통과 (0.90ms, 75.4MB)
테스트 12 〉	통과 (0.69ms, 77.5MB)
테스트 13 〉	통과 (0.69ms, 73.8MB)
테스트 14 〉	통과 (0.65ms, 75MB)
테스트 15 〉	통과 (0.67ms, 73MB)
 */
public class _115_날짜_비교하기_2 {
    public int solution(int[] date1, int[] date2) {
        LocalDate ld1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate ld2 = LocalDate.of(date2[0], date2[1], date2[2]);
        return ld1.isBefore(ld2) ? 1 : 0;
    }
}
