 package level0;

/*
테스트 1 〉	통과 (0.03ms, 79.2MB)
테스트 2 〉	통과 (0.02ms, 70.5MB)
테스트 3 〉	통과 (0.03ms, 73MB)
테스트 4 〉	통과 (0.03ms, 76.6MB)
테스트 5 〉	통과 (0.02ms, 72.7MB)
테스트 6 〉	통과 (0.03ms, 72MB)
테스트 7 〉	통과 (0.02ms, 77MB)
테스트 8 〉	통과 (0.02ms, 77.6MB)
테스트 9 〉	통과 (0.02ms, 74.2MB)
테스트 10 〉	통과 (0.02ms, 74.8MB)
 */
public class _157_치킨_쿠폰_3 {
    public static void main(String[] args) {
        int chicken = 89;
        int answer = solution(chicken);
        System.out.println(answer);
    }

    public static int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10) {
            int service = chicken / 10;
            int remain = chicken % 10;
            answer += service;
            chicken = service + remain;
        }
        return answer;
    }
}
