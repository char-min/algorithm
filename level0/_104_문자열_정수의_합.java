package level0;

/*
테스트 1 〉	통과 (0.07ms, 72.4MB)
테스트 2 〉	통과 (0.06ms, 85.4MB)
테스트 3 〉	통과 (0.04ms, 73.8MB)
테스트 4 〉	통과 (0.04ms, 74MB)
테스트 5 〉	통과 (0.08ms, 81.7MB)
테스트 6 〉	통과 (0.04ms, 78.6MB)
테스트 7 〉	통과 (0.05ms, 69.9MB)
테스트 8 〉	통과 (0.06ms, 72.4MB)
테스트 9 〉	통과 (0.04ms, 71.2MB)
테스트 10 〉	통과 (0.03ms, 84MB)
테스트 11 〉	통과 (0.12ms, 86.1MB)
테스트 12 〉	통과 (0.09ms, 77.9MB)
테스트 13 〉	통과 (0.05ms, 73.7MB)
테스트 14 〉	통과 (0.06ms, 76.8MB)
테스트 15 〉	통과 (0.04ms, 76.9MB)
테스트 16 〉	통과 (0.04ms, 77.3MB)
테스트 17 〉	통과 (0.05ms, 75.8MB)
테스트 18 〉	통과 (0.04ms, 79.3MB)
테스트 19 〉	통과 (0.04ms, 76.7MB)
 */
public class _104_문자열_정수의_합 {
    public int solution(String num_str) {
        int answer = 0;
        for (char c : num_str.toCharArray()) {
            answer += Character.digit(c, 10);
        }
        return answer;
    }
}
