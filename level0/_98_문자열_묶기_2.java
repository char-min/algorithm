package level0;

import java.util.*;
import java.util.stream.Collectors;

/*
테스트 1 〉	통과 (18.52ms, 118MB)
테스트 2 〉	통과 (5.75ms, 78.2MB)
테스트 3 〉	통과 (24.81ms, 121MB)
테스트 4 〉	통과 (29.15ms, 130MB)
테스트 5 〉	통과 (18.88ms, 111MB)
테스트 6 〉	통과 (13.66ms, 94.9MB)
테스트 7 〉	통과 (20.02ms, 109MB)
테스트 8 〉	통과 (13.84ms, 102MB)
테스트 9 〉	통과 (21.19ms, 111MB)
테스트 10 〉	통과 (11.40ms, 100MB)
테스트 11 〉	통과 (8.01ms, 80.3MB)
테스트 12 〉	통과 (17.39ms, 115MB)
테스트 13 〉	통과 (17.31ms, 125MB)
테스트 14 〉	통과 (17.42ms, 102MB)
테스트 15 〉	통과 (36.83ms, 107MB)
테스트 16 〉	통과 (12.62ms, 95MB)
테스트 17 〉	통과 (17.19ms, 116MB)
테스트 18 〉	통과 (13.25ms, 103MB)
테스트 19 〉	통과 (21.21ms, 108MB)
테스트 20 〉	통과 (21.22ms, 115MB)
테스트 21 〉	통과 (24.20ms, 130MB)
테스트 22 〉	통과 (15.36ms, 118MB)
테스트 23 〉	통과 (20.31ms, 108MB)
테스트 24 〉	통과 (17.76ms, 119MB)
 */
public class _98_문자열_묶기_2 {
    public int solution(String[] strArr) {
        return Arrays.stream(strArr).collect(Collectors.groupingBy(String::length))
                .values().stream().max(Comparator.comparing(List::size)).get().size();
    }
}
