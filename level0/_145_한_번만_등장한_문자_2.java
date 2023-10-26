package level0;

import java.util.*;
import java.util.stream.Collectors;

/*
테스트 1 〉	통과 (5.79ms, 78MB)
테스트 2 〉	통과 (7.48ms, 78.8MB)
테스트 3 〉	통과 (7.69ms, 76.6MB)
테스트 4 〉	통과 (5.89ms, 77.3MB)
테스트 5 〉	통과 (7.68ms, 74.1MB)
테스트 6 〉	통과 (5.44ms, 75.7MB)
테스트 7 〉	통과 (8.78ms, 73.6MB)
테스트 8 〉	통과 (6.68ms, 75MB)
테스트 9 〉	통과 (7.42ms, 74MB)
테스트 10 〉	통과 (5.35ms, 65MB)
 */
public class _145_한_번만_등장한_문자_2 {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(c -> c))
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }
}
