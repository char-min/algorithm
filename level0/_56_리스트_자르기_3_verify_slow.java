package level0;

import java.util.stream.IntStream;

public class _56_리스트_자르기_3_verify_slow {
    public static void main(String[] args) {
        int n = 3;
        int[] slicer = {1, 900_000, 2};
//        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num_list = new int[1000_000];
        for (int i=0, j=1; i< num_list.length; i++) {
            num_list[i] = j++;
        }
        StopWatch.start();
        int[] answer = solution(n ,slicer, num_list);
        StopWatch.end(); //69
//        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        return IntStream.iterate(n == 1 ? 0 : slicer[0],
                         i -> i <= (n == 2 ? num_list.length - 1 : slicer[1]),
                        i -> n == 4 ? i + slicer[2] : i + 1)
                .map(i -> num_list[i]).toArray();
    }
}
