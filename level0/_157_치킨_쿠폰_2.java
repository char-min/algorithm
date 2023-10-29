 package level0;

/*
테스트 1 〉	통과 (0.02ms, 79MB)
테스트 2 〉	통과 (0.02ms, 74MB)
테스트 3 〉	통과 (0.03ms, 71MB)
테스트 4 〉	통과 (0.01ms, 76.6MB)
테스트 5 〉	통과 (0.02ms, 71.9MB)
테스트 6 〉	통과 (0.02ms, 73.1MB)
테스트 7 〉	통과 (0.02ms, 75.8MB)
테스트 8 〉	통과 (0.02ms, 76.1MB)
테스트 9 〉	통과 (0.02ms, 77.1MB)
테스트 10 〉	통과 (0.01ms, 78MB)
 */
public class _157_치킨_쿠폰_2 {
    public static void main(String[] args) {
        int chicken = 89;
        int answer = solution(chicken);
        System.out.println(answer);
    }

    /*
    치킨 9마리에 1마리 공짜.
    단, 첫 9마리는 사먹어야함.
     */
    public static int solution(int chicken) {
        int answer = chicken / 9;
        if (chicken > 0 && chicken % 9 == 0) {
            answer--;
        }
        return answer;
    }
}
