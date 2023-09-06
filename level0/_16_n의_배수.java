package level0;

public class _16_n의_배수 {
    public static void main(String[] args) {
        int num = 98;
        int n = 2;
        int answer = solution(num, n);
        System.out.println(answer);
    }

    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}
