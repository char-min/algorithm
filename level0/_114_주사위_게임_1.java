package level0;

public class _114_주사위_게임_1 {
    public int solution(int a, int b) {
        int answer = 0;
        boolean aOdd = a % 2 == 1;
        boolean bOdd = b % 2 == 1;
        if (aOdd && bOdd) {
            answer = a * a + b * b;
        } else if (!aOdd && !bOdd) {
            answer = Math.abs(a - b);
        } else {
            answer = 2 * (a + b);
        }
        return answer;
    }
}
