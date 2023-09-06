package level0;

public class _14_더_크게_합치기 {
    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        int answer = solution(a, b);
        System.out.println(answer);
    }

    public static int solution(int a, int b) {
        int aFirst = Integer.valueOf(String.valueOf(a) + b);
        int bFirst = Integer.valueOf(String.valueOf(b) + a);
        return aFirst > bFirst ? aFirst : bFirst;
    }
}
