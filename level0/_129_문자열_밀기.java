package level0;

/*
테스트 1 〉	통과 (13.37ms, 78.6MB)
테스트 2 〉	통과 (13.98ms, 67.3MB)
테스트 3 〉	통과 (0.02ms, 84.4MB)
테스트 4 〉	통과 (11.90ms, 88.6MB)
테스트 5 〉	통과 (12.55ms, 78.2MB)
테스트 6 〉	통과 (10.93ms, 74.2MB)
테스트 7 〉	통과 (9.09ms, 77.7MB)
테스트 8 〉	통과 (10.16ms, 78.3MB)
 */
public class _129_문자열_밀기 {
    public int solution(String A, String B) {
        int answer = 0;
        if (A.equals(B)) {
            return answer;
        }
        for (int i=0; i<A.length(); i++) {
            char c = A.charAt(0);
            A = A.substring(1, A.length()) + c;
            answer++;
            if (A.equals(B)) {
                return answer;
            }
        }
        return-1;
    }
}
