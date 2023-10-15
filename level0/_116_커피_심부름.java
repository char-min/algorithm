package level0;

/*
테스트 1 〉	통과 (0.04ms, 69.8MB)
테스트 2 〉	통과 (0.06ms, 74.1MB)
테스트 3 〉	통과 (0.05ms, 71.5MB)
테스트 4 〉	통과 (0.14ms, 72.6MB)
테스트 5 〉	통과 (0.10ms, 75.4MB)
테스트 6 〉	통과 (0.18ms, 70MB)
테스트 7 〉	통과 (0.22ms, 76.6MB)
테스트 8 〉	통과 (0.22ms, 73.2MB)
테스트 9 〉	통과 (0.22ms, 74.3MB)
테스트 10 〉	통과 (0.86ms, 74.2MB)
테스트 11 〉	통과 (0.48ms, 75.9MB)
테스트 12 〉	통과 (0.54ms, 73.6MB)
테스트 13 〉	통과 (0.70ms, 77.4MB)
테스트 14 〉	통과 (0.72ms, 74.8MB)
테스트 15 〉	통과 (0.92ms, 79.1MB)
테스트 16 〉	통과 (0.86ms, 77.4MB)
테스트 17 〉	통과 (0.91ms, 74.3MB)
테스트 18 〉	통과 (0.83ms, 74.4MB)
테스트 19 〉	통과 (0.08ms, 85.8MB)
테스트 20 〉	통과 (0.03ms, 74.3MB)
 */
public class _116_커피_심부름 {
    static final int AMERICANO = 4500;
    static final int CAFFELATTE = 5000;
    public int solution(String[] order) {
        int answer = 0;
        for (String o : order) {
            if (o.equals("anything") || o.contains("americano")) {
                answer += AMERICANO;
            } else {
                answer += CAFFELATTE;
            }
        }
        return answer;
    }
}
