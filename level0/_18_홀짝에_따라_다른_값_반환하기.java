package level0;

public class _18_홀짝에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        int n = 7;
        int answer = solution(n);
        System.out.println(answer);
    }

    public static int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            answer = (n+1) * (n+1) / 4;
        } else {
            answer = n * (n+1) * (n+2) / 6;
        }
        return answer;
    }
}
