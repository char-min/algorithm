package level0;

import java.util.HashMap;
import java.util.Map;

public class _23_주사위_게임_2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 1;
        int answer = solution(a, b, c);
        System.out.println(answer);
    }

    public static int solution(int a, int b, int c) {
        int answer = 1;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(a, countMap.getOrDefault(a, 0)+1);
        countMap.put(b, countMap.getOrDefault(b, 0)+1);
        countMap.put(c, countMap.getOrDefault(c, 0)+1);
        int max = 0;
        for (int key : countMap.keySet()) {
            max = Math.max(countMap.get(key), max);
        }
        for (int i=1; i<=max; i++) {
            answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
        }
        return answer;
    }
}
