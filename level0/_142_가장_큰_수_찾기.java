package level0;

public class _142_가장_큰_수_찾기 {
    public int[] solution(int[] array) {
        int max = 0, idx = 0;
        for (int i=0; i<array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                idx = i;
            }
        }
        return new int[]{max, idx};
    }
}
