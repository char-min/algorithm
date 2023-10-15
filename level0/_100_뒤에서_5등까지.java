package level0;

import java.util.Arrays;

public class _100_뒤에서_5등까지 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOf(num_list, 5);
    }
}
