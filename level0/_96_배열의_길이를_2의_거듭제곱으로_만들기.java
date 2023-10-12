package level0;

import java.util.Arrays;

public class _96_배열의_길이를_2의_거듭제곱으로_만들기 {
    public int[] solution(int[] arr) {
        int len = 1;
        while (len < arr.length) {
            len *= 2;
        }
        return Arrays.copyOfRange(arr, 0, len);
    }
}
