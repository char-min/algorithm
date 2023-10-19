package level0;

/*
테스트 1 〉	통과 (0.03ms, 76.7MB)
테스트 2 〉	통과 (0.04ms, 72.1MB)
테스트 3 〉	통과 (0.02ms, 76.4MB)
테스트 4 〉	통과 (0.03ms, 70.8MB)
테스트 5 〉	통과 (0.04ms, 77.9MB)
테스트 6 〉	통과 (0.03ms, 74.2MB)
테스트 7 〉	통과 (0.03ms, 72.9MB)
테스트 8 〉	통과 (0.02ms, 73.1MB)
 */
public class _129_문자열_밀기_2 {
    public int solution(String A, String B) {
        return B.repeat(2).indexOf(A);
    }
}
