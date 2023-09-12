package level0;

import java.util.Arrays;

public class _26_마지막_두_원소 {
    public static void main(String[] args) {
//        int[] num_list = {2, 1, 6};
        int len = 100_000;
        int[] num_list = new int[len];
        for (int i=0; i<len; i++) {
            num_list[i] = i+1;
        }
        StopWatch.start();
        int[] answer = solution(num_list);
        StopWatch.end(); //1
//        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = Arrays.copyOf(num_list, len+1);
        int last = num_list[len - 1];
        int prev = num_list[len - 2];
        answer[answer.length-1] = last > prev ? last - prev : last * 2;
        return answer;
    }
}
