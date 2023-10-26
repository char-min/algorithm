package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
테스트 1 〉	통과 (1.84ms, 72.1MB)
테스트 2 〉	통과 (1.97ms, 78.4MB)
테스트 3 〉	통과 (3.08ms, 91.9MB)
테스트 4 〉	통과 (1.77ms, 75.1MB)
테스트 5 〉	통과 (3.08ms, 76.9MB)
테스트 6 〉	통과 (3.22ms, 76.8MB)
테스트 7 〉	통과 (2.78ms, 80.8MB)
 */
public class _148_대문자와_소문자_2 {
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(c -> String.valueOf((char)(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))))
                .collect(Collectors.joining());
    }
}
