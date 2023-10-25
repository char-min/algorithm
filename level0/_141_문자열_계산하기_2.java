package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (2.01ms, 74.2MB)
테스트 2 〉	통과 (2.03ms, 76.7MB)
테스트 3 〉	통과 (1.65ms, 78.2MB)
테스트 4 〉	통과 (1.59ms, 74.6MB)
테스트 5 〉	통과 (1.81ms, 77.5MB)
테스트 6 〉	통과 (1.69ms, 79.4MB)
테스트 7 〉	통과 (2.93ms, 82.2MB)
테스트 8 〉	통과 (2.04ms, 82.3MB)
테스트 9 〉	통과 (1.93ms, 75.4MB)
테스트 10 〉	통과 (1.78ms, 68.3MB)
 */
public class _141_문자열_계산하기_2 {
    public int solution(String myString) {
        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
    }
}
