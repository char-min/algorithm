package level0;

import java.util.Arrays;

public class _71_조건에_맞게_수열_변환하기_1 {
    public int[] solution(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i] >= 50 && arr[i] % 2 == 0 ? arr[i] / 2
                    : arr[i] < 50 && arr[i] % 2 == 1 ? arr[i] * 2
                    : arr[i];
        }
        return arr;
    }
}
