package level0;

/*
테스트 1 〉	통과 (0.03ms, 71.4MB)
테스트 2 〉	통과 (0.04ms, 76.6MB)
테스트 3 〉	통과 (0.03ms, 68.1MB)
테스트 4 〉	통과 (0.03ms, 72.2MB)
테스트 5 〉	통과 (0.01ms, 77.4MB)
테스트 6 〉	통과 (0.02ms, 77.4MB)
테스트 7 〉	통과 (0.02ms, 77.3MB)
테스트 8 〉	통과 (0.04ms, 74.1MB)
 */
public class _140_배열의_유사도 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s1E : s1) {
            for (String s2E : s2) {
                if (s1E.equals(s2E)) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
