package level0;
/*
테스트 1 〉	통과 (0.03ms, 81.5MB)
테스트 2 〉	통과 (0.01ms, 73.8MB)
테스트 3 〉	통과 (0.02ms, 71.4MB)
테스트 4 〉	통과 (0.01ms, 71.6MB)
테스트 5 〉	통과 (0.02ms, 78.3MB)
테스트 6 〉	통과 (0.01ms, 84.6MB)
테스트 7 〉	통과 (0.04ms, 79.6MB)
테스트 8 〉	통과 (0.01ms, 76.7MB)
테스트 9 〉	통과 (0.01ms, 74.3MB)
테스트 10 〉	통과 (0.02ms, 75.4MB)
테스트 11 〉	통과 (0.02ms, 73.8MB)
테스트 12 〉	통과 (0.02ms, 77.3MB)
테스트 13 〉	통과 (0.01ms, 77MB)
테스트 14 〉	통과 (0.01ms, 74.3MB)
 */
public class _150_369게임_2 {
    public static void main(String[] args) {
        int order = 3;
        int answer = solution(order);
        System.out.println(answer);
    }

    public static int solution(int order) {
        int answer = 0;
        while (order > 0) {
            if (order % 3 == 0 || order % 6 == 0 || order % 9 == 0) {
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}
