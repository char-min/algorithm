package level0;

import sample._1.StopWatch;

import java.util.stream.IntStream;

public class _22_등차수열의_특정한_항만_더하기_2_slow {
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};
        StopWatch.start();
        int answer = solution(a, d, included);
        StopWatch.end(); //9
        System.out.println(answer);
    }

    public static int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(idx -> included[idx] ? a + d * idx : 0).sum();
    }
}
