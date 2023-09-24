package level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class _58_배열_만들기_3 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answerList = new ArrayList<>();
        for (int[] interval : intervals) {
            int sIdx = interval[0];
            int eIdx = interval[1];
            for (int i=sIdx; i<=eIdx; i++) {
                answerList.add(arr[i]);
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
