package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (2.11ms, 87.2MB)
테스트 2 〉	통과 (5.54ms, 74.7MB)
테스트 3 〉	통과 (2.37ms, 74.1MB)
테스트 4 〉	통과 (2.08ms, 80.5MB)
테스트 5 〉	통과 (1.80ms, 68MB)
테스트 6 〉	통과 (1.91ms, 80MB)
테스트 7 〉	통과 (1.99ms, 70.9MB)
테스트 8 〉	통과 (2.45ms, 77MB)
테스트 9 〉	통과 (1.53ms, 75.1MB)
테스트 10 〉	통과 (1.89ms, 77.1MB)
 */
public class _141_문자열_계산하기_2 {
    public int solution(String myString) {
        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("\\+ ", "").split(" "))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
