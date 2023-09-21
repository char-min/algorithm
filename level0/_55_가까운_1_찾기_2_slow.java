package level0;

import java.util.stream.IntStream;

public class _55_가까운_1_찾기_2_slow {
    public static void main(String[] args) {
        int[] arr = new int[100000000];
        arr[arr.length-1] = 1;
        int idx = 0;
        StopWatch.start();
        int answer = solution(arr, idx);
        StopWatch.end(); //302
        System.out.println(answer);
    }

    public static int solution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
    }
}
