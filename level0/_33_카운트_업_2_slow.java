package level0;

import java.util.stream.IntStream;

public class _33_카운트_업_2_slow {
    public static void main(String[] args) {
        int start_num = 0;
        int end_num = 1000_000;
        StopWatch.start();
        int[] answer = solution(start_num, end_num);
        StopWatch.end(); //30
//        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
