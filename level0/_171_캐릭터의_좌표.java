package level0;

import java.util.HashMap;
import java.util.Map;

/*
테스트 1 〉	통과 (0.04ms, 74.2MB)
테스트 2 〉	통과 (0.02ms, 77.4MB)
테스트 3 〉	통과 (0.04ms, 79.5MB)
테스트 4 〉	통과 (0.02ms, 74.7MB)
테스트 5 〉	통과 (0.04ms, 92.7MB)
테스트 6 〉	통과 (0.03ms, 73.9MB)
테스트 7 〉	통과 (0.04ms, 76.9MB)
테스트 8 〉	통과 (0.03ms, 76.5MB)
테스트 9 〉	통과 (0.03ms, 74.3MB)
테스트 10 〉	통과 (0.03ms, 67.5MB)
테스트 11 〉	통과 (0.05ms, 72.1MB)
 */
public class _171_캐릭터의_좌표 {
    public int[] solution(String[] keyinput, int[] board) {
        Map<String, int[]> direction = new HashMap<>();
        direction.put("up", new int[]{0, 1});
        direction.put("down", new int[]{0, -1});
        direction.put("left", new int[]{-1, 0});
        direction.put("right", new int[]{1, 0});
        int currX = 0;
        int currY = 0;
        for (String key : keyinput) {
            int[] delta = direction.get(key);
            int nextX = currX + delta[0];
            int nextY = currY + delta[1];
            if (!isOutside(nextX, board[0] / 2) && !isOutside(nextY, board[1] / 2)) {
                currX = nextX;
                currY = nextY;
            }
        }
        return new int[] {currX, currY};
    }

    private boolean isOutside(int x, int halfLen) {
        if (x < -1 * halfLen || x > halfLen) {
            return true;
        }
        return false;
    }
}
