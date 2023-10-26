package level0;

/*
테스트 1 〉	통과 (0.05ms, 71.6MB)
테스트 2 〉	통과 (0.03ms, 74.7MB)
테스트 3 〉	통과 (0.05ms, 86.1MB)
테스트 4 〉	통과 (0.07ms, 75.2MB)
테스트 5 〉	통과 (0.02ms, 71.2MB)
테스트 6 〉	통과 (0.06ms, 71.9MB)
테스트 7 〉	통과 (0.25ms, 82.3MB)
테스트 8 〉	통과 (0.12ms, 74.8MB)
테스트 9 〉	통과 (0.08ms, 78.1MB)
테스트 10 〉	통과 (0.07ms, 78MB)
테스트 11 〉	통과 (0.05ms, 76.6MB)
 */
public class _149_암호_해독 {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<cipher.length(); i++) {
            if ((i+1) % code == 0) {
                sb.append(cipher.charAt(i));
            }
        }
        return sb.toString();
    }
}
