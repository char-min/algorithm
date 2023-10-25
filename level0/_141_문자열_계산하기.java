package level0;

/*
테스트 1 〉	통과 (0.04ms, 74.4MB)
테스트 2 〉	통과 (0.06ms, 79.1MB)
테스트 3 〉	통과 (0.08ms, 78.4MB)
테스트 4 〉	통과 (0.05ms, 77.4MB)
테스트 5 〉	통과 (0.04ms, 74.3MB)
테스트 6 〉	통과 (0.05ms, 73.9MB)
테스트 7 〉	통과 (0.05ms, 79.8MB)
테스트 8 〉	통과 (0.05ms, 82MB)
테스트 9 〉	통과 (0.03ms, 74.3MB)
테스트 10 〉	통과 (0.04ms, 76.9MB)
 */
public class _141_문자열_계산하기 {
    public int solution(String my_string) {
        int answer = 0;
        String op = "+";
        int idx = 0;
        boolean isBreak = false;
        while (true) {
            idx = my_string.indexOf(" ");
            if (idx == -1) {
                idx = my_string.length();
                isBreak = true;
            }
            int num = Integer.parseInt(my_string.substring(0, idx));
            if ("+".equals(op)) {
                answer += num;
            } else {
                answer -= num;
            }
            if (isBreak) {
                break;
            }
            op = my_string.substring(idx+1, idx+2);
            my_string = my_string.substring(idx+3, my_string.length());
        }
        return answer;
    }
}
