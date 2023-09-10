package level0;

public class _20_flag에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = true;
        int answer = solution(a, b, flag);
        System.out.println(answer);
    }

    public static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
