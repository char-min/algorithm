package level0;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
테스트 1 〉	통과 (1.57ms, 73.7MB)
테스트 2 〉	통과 (1.99ms, 79MB)
테스트 3 〉	통과 (1.57ms, 75.5MB)
테스트 4 〉	통과 (1.73ms, 69.4MB)
테스트 5 〉	통과 (1.80ms, 77.5MB)
테스트 6 〉	통과 (2.17ms, 72.5MB)
테스트 7 〉	통과 (1.99ms, 80.6MB)
테스트 8 〉	통과 (1.50ms, 75.4MB)
테스트 9 〉	통과 (2.13ms, 81MB)
테스트 10 〉	통과 (1.50ms, 75.2MB)
테스트 11 〉	통과 (1.41ms, 78.9MB)
테스트 12 〉	통과 (1.42ms, 82.2MB)
테스트 13 〉	통과 (2.49ms, 72.5MB)
테스트 14 〉	통과 (1.83ms, 81.5MB)
테스트 15 〉	통과 (2.03ms, 78.4MB)
테스트 16 〉	통과 (1.78ms, 76.3MB)
테스트 17 〉	통과 (1.94ms, 73.6MB)
테스트 18 〉	통과 (1.52ms, 78MB)
테스트 19 〉	통과 (1.60ms, 76.3MB)
 */
public class _112_꼬리_문자열_2 {
    public String solution(String[] str_list, String ex) {
        return Stream.of(str_list).filter(s -> !s.contains(ex)).collect(Collectors.joining());
    }
}
