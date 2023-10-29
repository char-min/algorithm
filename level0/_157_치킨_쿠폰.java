package level0;

/*
테스트 1 〉	통과 (0.02ms, 73MB)
테스트 2 〉	통과 (1.37ms, 75.9MB)
테스트 3 〉	통과 (2.54ms, 77.4MB)
테스트 4 〉	통과 (0.47ms, 82.2MB)
테스트 5 〉	통과 (1.05ms, 78.2MB)
테스트 6 〉	통과 (0.03ms, 76.1MB)
테스트 7 〉	통과 (0.02ms, 86.3MB)
테스트 8 〉	통과 (0.14ms, 75.4MB)
테스트 9 〉	통과 (0.05ms, 83.8MB)
테스트 10 〉	통과 (0.08ms, 86MB)
 */
public class _157_치킨_쿠폰 {
    public static void main(String[] args) {
        int chicken = 89;
        int answer = solution(chicken);
        System.out.println(answer);
    }

    public static int solution(int chicken) {
        int answer = 0;
        while (chicken > 0) {
            if (chicken >= 10) {
                answer++;
                chicken++;
            }
            chicken -= 10;
        }
        return answer;
    }
}
