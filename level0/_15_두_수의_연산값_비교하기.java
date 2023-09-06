package level0;

public class _15_두_수의_연산값_비교하기 {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        StopWatch.start();
        int answer = solution(a, b);
        System.out.println(answer);
        StopWatch.end(); //79

        StopWatch.start();
        int answer2 = solution2(a, b);
        System.out.println(answer2);
        StopWatch.end(); //0 //@HotSpotIntrinsicCandidate
    }

    public static int solution2(int a, int b) {
        return Math.max(Integer.valueOf(String.valueOf(a) + b), 2 * a * b);
    }

    public static int solution(int a, int b) {
        int aPlusB = Integer.valueOf(String.valueOf(a) + b);
        int _2ab = 2 * a * b;
        return aPlusB >= _2ab ? aPlusB : _2ab;
    }
}
