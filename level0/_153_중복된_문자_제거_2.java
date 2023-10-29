package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
테스트 1 〉	통과 (1.77ms, 71.7MB)
테스트 2 〉	통과 (1.28ms, 76.4MB)
테스트 3 〉	통과 (2.10ms, 74.5MB)
테스트 4 〉	통과 (1.51ms, 75.9MB)
테스트 5 〉	통과 (1.50ms, 75.4MB)
테스트 6 〉	통과 (1.38ms, 72MB)
테스트 7 〉	통과 (1.79ms, 76.5MB)
 */
public class _153_중복된_문자_제거_2 {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }
}
