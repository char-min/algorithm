package level0;

import java.util.Arrays;

public class _56_리스트_자르기 {
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
        StopWatch.end(); //3
//        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = null;
        switch (n) {
            case 1:
                answer = Arrays.copyOf(num_list, slicer[1]+1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
                break;
            case 4:
                int a = slicer[0], b = slicer[1], c = slicer[2];
                answer = new int[(b-a)/c+1];
                for (int i=a, j=0; i<=b; i+=c) {
                    answer[j++] = num_list[i];
                }
                break;
        }
        return answer;
    }
}
