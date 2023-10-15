package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
테스트 1 〉	통과 (3.23ms, 74.6MB)
테스트 2 〉	통과 (4.72ms, 77.9MB)
테스트 3 〉	통과 (5.06ms, 77.8MB)
테스트 4 〉	통과 (5.57ms, 72MB)
테스트 5 〉	통과 (3.98ms, 72.3MB)
테스트 6 〉	통과 (3.81ms, 84.2MB)
테스트 7 〉	통과 (4.34ms, 77.3MB)
테스트 8 〉	통과 (4.58ms, 77.7MB)
테스트 9 〉	통과 (6.92ms, 74.3MB)
테스트 10 〉	통과 (6.52ms, 74.4MB)
테스트 11 〉	통과 (5.95ms, 79MB)
테스트 12 〉	통과 (6.16ms, 74.5MB)
테스트 13 〉	통과 (2.98ms, 69.6MB)
 */
public class _109_배열의_원소_삭제하기_2 {
    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(d -> d == i)).toArray();
    }
}
