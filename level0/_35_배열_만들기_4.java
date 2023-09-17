package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _35_배열_만들기_4 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int[] answer = solution(arr);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        int i=0;
        while (i < arr.length) {
            if (stkList.isEmpty()) {
                stkList.add(arr[i++]);
            } else {
                int lastIdx = stkList.size()-1;
                int last = stkList.get(lastIdx);
                if (last < arr[i]) {
                    stkList.add(arr[i++]);
                } else {
                    stkList.remove(lastIdx);
                }
            }
        }
        return stkList.stream().mapToInt(Integer::intValue).toArray();
    }
}
