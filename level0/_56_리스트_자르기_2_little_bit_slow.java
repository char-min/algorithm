package level0;

public class _56_리스트_자르기_2_little_bit_slow {
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
        StopWatch.end(); //10
//        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0], b = slicer[1], c = slicer[2];
        int start = n == 1 ? 0 : a;
        int end = n == 2 ? num_list.length-1 : b;
        int interval = n == 4 ? c : 1;
        int[] answer = new int[(end - start) / interval + 1];
        for (int i=start, j=0; i<=end; i+=interval) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}
