package level0;

import java.util.stream.IntStream;

/*

 */
public class _59_2의_영역_2_slow {
    public static void main(String[] args) {
        int[] arr = new int[1000_000];
        for (int i=0, j=1; i<1000_000; i++) {
            arr[i] = j;
            j = j > 10 ? 1 : j+1;
        }
        StopWatch.start();
        int[] answer = solution(arr);
        StopWatch.end(); //63
        //System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] arr) {
        int[] idx = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
        if (idx.length == 0) return new int[]{-1};
        return IntStream.rangeClosed(idx[0], idx[idx.length - 1]).map(i -> arr[i]).toArray();
    }
}
