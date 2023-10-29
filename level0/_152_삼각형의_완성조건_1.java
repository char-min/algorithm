package level0;

import java.util.Arrays;

public class _152_삼각형의_완성조건_1 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}
