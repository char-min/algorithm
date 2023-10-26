package level0;

/*
테스트 1 〉	통과 (0.04ms, 71.8MB)
테스트 2 〉	통과 (0.04ms, 75.3MB)
테스트 3 〉	통과 (0.03ms, 77.4MB)
테스트 4 〉	통과 (0.05ms, 74MB)
테스트 5 〉	통과 (0.05ms, 72.3MB)
테스트 6 〉	통과 (0.05ms, 73.2MB)
테스트 7 〉	통과 (0.13ms, 82.1MB)
테스트 8 〉	통과 (0.13ms, 76.4MB)
테스트 9 〉	통과 (0.10ms, 78.3MB)
테스트 10 〉	통과 (0.06ms, 77.3MB)
테스트 11 〉	통과 (0.04ms, 72.7MB)
 */
public class _149_암호_해독_2 {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for (int i=code-1; i<cipher.length(); i+=code) {
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}
