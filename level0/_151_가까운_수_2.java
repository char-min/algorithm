package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
테스트 1 〉	통과 (4.12ms, 75.3MB)
테스트 2 〉	통과 (3.07ms, 80.2MB)
테스트 3 〉	통과 (3.69ms, 74.6MB)
테스트 4 〉	통과 (3.85ms, 83MB)
테스트 5 〉	통과 (4.35ms, 73.1MB)
테스트 6 〉	통과 (4.61ms, 72.8MB)
테스트 7 〉	통과 (15.15ms, 77.3MB)
테스트 8 〉	통과 (4.58ms, 75.5MB)
테스트 9 〉	통과 (4.11ms, 75.4MB)
테스트 10 〉	통과 (4.35ms, 86.3MB)
테스트 11 〉	통과 (4.10ms, 87.9MB)
테스트 12 〉	통과 (3.09ms, 73.8MB)
테스트 13 〉	통과 (4.49ms, 84.9MB)
테스트 14 〉	통과 (5.16ms, 73.9MB)
테스트 15 〉	통과 (4.42ms, 73.5MB)
테스트 16 〉	통과 (4.22ms, 75.6MB)
테스트 17 〉	통과 (3.58ms, 75.9MB)
테스트 18 〉	통과 (3.84ms, 75MB)
 */
public class _151_가까운_수_2 {
    public int solution(int[] array, int n) {
        List<Integer> diffList = Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList());
        int min = diffList.stream().mapToInt(Integer::intValue).min().orElse(0);
        return Math.min(array[diffList.indexOf(min)], array[diffList.lastIndexOf(min)]);
    }
}
