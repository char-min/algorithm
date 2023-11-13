package level0;

import java.util.StringTokenizer;

/*
테스트 1 〉	통과 (0.33ms, 82.3MB)
테스트 2 〉	통과 (0.17ms, 74.3MB)
테스트 3 〉	통과 (0.17ms, 72.2MB)
테스트 4 〉	통과 (0.21ms, 73.8MB)
테스트 5 〉	통과 (0.15ms, 73.3MB)
테스트 6 〉	통과 (0.13ms, 76.1MB)
테스트 7 〉	통과 (0.18ms, 82.2MB)
테스트 8 〉	통과 (0.14ms, 75MB)
테스트 9 〉	통과 (0.15ms, 75.2MB)
테스트 10 〉	통과 (0.16ms, 76.6MB)
 */
public class _168_숨어있는_숫자의_덧셈_2_2 {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", " ");
        StringTokenizer st = new StringTokenizer(my_string, " ");
        int answer = 0;
        while (st.hasMoreTokens()) {
            answer += Integer.parseInt(st.nextToken());
        }
        return answer;
    }
}
