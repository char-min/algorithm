package level0;

/*
테스트 1 〉	통과 (1.72ms, 68.8MB)
테스트 2 〉	통과 (2.46ms, 75.4MB)
테스트 3 〉	통과 (2.31ms, 74.9MB)
테스트 4 〉	통과 (1.98ms, 71.8MB)
테스트 5 〉	통과 (2.69ms, 77.1MB)
테스트 6 〉	통과 (1.74ms, 79.5MB)
테스트 7 〉	통과 (1.98ms, 74MB)
테스트 8 〉	통과 (1.93ms, 82MB)
테스트 9 〉	통과 (1.71ms, 77.1MB)
테스트 10 〉	통과 (1.77ms, 76.2MB)
 */
public class _168_숨어있는_숫자의_덧셈_2 {
    public int solution(String my_string) {
        my_string = my_string + ".";
        int answer = 0;
        int s=-1, e=0;
        for (int i=0; i<my_string.length(); i++) {
            if (s == -1 && Character.isDigit(my_string.charAt(i))) {
                s = i;
            }
            if (s != -1 && !Character.isDigit(my_string.charAt(i))) {
                e = i;
                answer += Integer.parseInt(my_string.substring(s, e));
                s = -1;
            }
        }
        return answer;
    }
}
