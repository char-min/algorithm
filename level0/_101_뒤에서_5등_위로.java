package level0;

import java.util.Arrays;

public class _101_뒤에서_5등_위로 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}
