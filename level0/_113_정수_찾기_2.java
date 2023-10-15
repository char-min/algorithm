package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (1.22ms, 73.1MB)
테스트 2 〉	통과 (1.13ms, 75.2MB)
테스트 3 〉	통과 (1.71ms, 79.5MB)
테스트 4 〉	통과 (1.42ms, 78.7MB)
테스트 5 〉	통과 (1.74ms, 77MB)
테스트 6 〉	통과 (1.23ms, 76.4MB)
테스트 7 〉	통과 (1.68ms, 73.7MB)
테스트 8 〉	통과 (2.82ms, 76.2MB)
테스트 9 〉	통과 (1.42ms, 74.4MB)
테스트 10 〉	통과 (1.23ms, 76.4MB)
테스트 11 〉	통과 (1.18ms, 72.8MB)
테스트 12 〉	통과 (1.16ms, 71.6MB)
테스트 13 〉	통과 (1.45ms, 70.2MB)
테스트 14 〉	통과 (1.31ms, 69.9MB)
테스트 15 〉	통과 (1.18ms, 75.7MB)
테스트 16 〉	통과 (1.69ms, 84.1MB)
테스트 17 〉	통과 (1.62ms, 65.3MB)
테스트 18 〉	통과 (1.13ms, 71.5MB)
테스트 19 〉	통과 (1.83ms, 77.6MB)
 */
public class _113_정수_찾기_2 {
    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).anyMatch(num -> num == n) ? 1 : 0;
    }
}
