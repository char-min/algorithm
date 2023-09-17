package level0;

import java.util.Arrays;

public class _33_카운트_업 {
    public static void main(String[] args) {
        int start_num = 0;
        int end_num = 1000_000;
        StopWatch.start();
        int[] answer = solution(start_num, end_num);
        StopWatch.end(); //16
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for (int idx = 0, i=start_num; i<=end_num; i++, idx++) {
            answer[idx] = i;
        }
        return answer;
    }
}
