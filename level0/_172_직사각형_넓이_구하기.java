package level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
테스트 1 〉	통과 (0.29ms, 74.7MB)
테스트 2 〉	통과 (0.30ms, 77.9MB)
테스트 3 〉	통과 (0.38ms, 76.9MB)
테스트 4 〉	통과 (0.23ms, 73.3MB)
테스트 5 〉	통과 (0.24ms, 77.5MB)
 */
public class _172_직사각형_넓이_구하기 {
    public static void main(String[] args) {
        int[] dot1 = {1, 1};
        int[] dot2 = {2, 1};
        int len = getLength(dot1, dot2);
        System.out.println(len);
    }

    public int solution(int[][] dots) {
        List<Integer> lengthList = new ArrayList<>();
        for (int i=1; i<dots.length; i++) {
            lengthList.add(getLength(dots[0], dots[i]));
        }
        Collections.sort(lengthList);
        return lengthList.get(0) * lengthList.get(1);
    }

    private static int getLength(int[] dot1, int[] dot2) {
        return (int)Math.sqrt(Math.pow(dot1[0] - dot2[0], 2) + Math.pow(dot1[1] - dot2[1], 2));
    }
}
