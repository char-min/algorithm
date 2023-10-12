package level0;

import java.util.stream.IntStream;

/*
테스트 1 〉	통과 (0.03ms, 68.6MB)
테스트 2 〉	통과 (0.02ms, 70MB)
테스트 3 〉	통과 (0.02ms, 72.4MB)
테스트 4 〉	통과 (1.59ms, 77MB)
테스트 5 〉	통과 (0.02ms, 77.2MB)
테스트 6 〉	통과 (1.64ms, 78.1MB)
테스트 7 〉	통과 (1.04ms, 73.7MB)
테스트 8 〉	통과 (0.03ms, 85.3MB)
테스트 9 〉	통과 (0.03ms, 80.3MB)
테스트 10 〉	통과 (0.02ms, 75.7MB)
테스트 11 〉	통과 (0.02ms, 74.4MB)
테스트 12 〉	통과 (0.03ms, 77.1MB)
테스트 13 〉	통과 (1.12ms, 75.9MB)
테스트 14 〉	통과 (0.04ms, 74.9MB)
테스트 15 〉	통과 (1.60ms, 77.3MB)
테스트 16 〉	통과 (0.89ms, 74.5MB)
테스트 17 〉	통과 (0.83ms, 76.2MB)
테스트 18 〉	통과 (0.95ms, 73.3MB)
테스트 19 〉	통과 (1.03ms, 77.1MB)
테스트 20 〉	통과 (1.10ms, 70.5MB)
테스트 21 〉	통과 (0.02ms, 64.7MB)
테스트 22 〉	통과 (0.02ms, 75.3MB)
테스트 23 〉	통과 (0.02ms, 75.1MB)
테스트 24 〉	통과 (0.03ms, 78.1MB)
테스트 25 〉	통과 (0.04ms, 72.3MB)
 */
public class _97_배열_비교하기_2 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);
        if (answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }
        return answer;
    }
}
