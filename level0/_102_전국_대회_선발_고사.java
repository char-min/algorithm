package level0;

import java.util.*;

/*
테스트 1 〉	통과 (0.35ms, 80.6MB)
테스트 2 〉	통과 (0.23ms, 73MB)
테스트 3 〉	통과 (0.38ms, 74.2MB)
테스트 4 〉	통과 (0.31ms, 74.7MB)
테스트 5 〉	통과 (0.35ms, 81MB)
테스트 6 〉	통과 (0.35ms, 80.1MB)
테스트 7 〉	통과 (0.28ms, 73MB)
테스트 8 〉	통과 (0.36ms, 77.4MB)
테스트 9 〉	통과 (0.52ms, 67.1MB)
테스트 10 〉	통과 (0.56ms, 72.8MB)
테스트 11 〉	통과 (0.56ms, 72.1MB)
테스트 12 〉	통과 (0.22ms, 71.6MB)
테스트 13 〉	통과 (0.30ms, 81.6MB)
테스트 14 〉	통과 (0.38ms, 77.7MB)
테스트 15 〉	통과 (0.34ms, 78.8MB)
테스트 16 〉	통과 (0.23ms, 75.5MB)
테스트 17 〉	통과 (0.35ms, 75.3MB)
테스트 18 〉	통과 (0.25ms, 73MB)
테스트 19 〉	통과 (0.27ms, 75.5MB)
 */
public class _102_전국_대회_선발_고사 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        int answer = solution(rank, attendance);
        System.out.println(answer);
    }

    public static int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> rankToIdxMap = new HashMap<>();
        List<Integer> rankList = new ArrayList<>();
        for (int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                rankToIdxMap.put(rank[i], i);
                rankList.add(rank[i]);
            }
        }
        Collections.sort(rankList);
        int multiply = 10000;
        int answer = 0;
        for (int i=0; i<3; i++) {
            answer += multiply * rankToIdxMap.get(rankList.get(i));
            multiply /= 100;
        }
        return answer;
    }
}
