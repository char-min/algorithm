package level0;

import java.util.*;

/*
테스트 1 〉	통과 (0.79ms, 77.3MB)
테스트 2 〉	통과 (0.75ms, 70.7MB)
테스트 3 〉	통과 (0.73ms, 70.9MB)
테스트 4 〉	통과 (0.73ms, 77.9MB)
테스트 5 〉	통과 (0.76ms, 75.9MB)
테스트 6 〉	통과 (1.18ms, 78.5MB)
테스트 7 〉	통과 (0.73ms, 77.4MB)
테스트 8 〉	통과 (0.89ms, 74.6MB)
테스트 9 〉	통과 (1.01ms, 76.1MB)
테스트 10 〉	통과 (0.92ms, 74.9MB)
테스트 11 〉	통과 (0.78ms, 73.9MB)
테스트 12 〉	통과 (1.02ms, 83.1MB)
테스트 13 〉	통과 (0.99ms, 79.1MB)
테스트 14 〉	통과 (0.75ms, 72.7MB)
테스트 15 〉	통과 (0.71ms, 76.8MB)
테스트 16 〉	통과 (0.73ms, 76.1MB)
테스트 17 〉	통과 (1.03ms, 80.1MB)
테스트 18 〉	통과 (0.79ms, 72.3MB)
테스트 19 〉	통과 (0.96ms, 77.6MB)
 */
public class _102_전국_대회_선발_고사_2 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        int answer = solution(rank, attendance);
        System.out.println(answer);
    }

    public static int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> rank[i1] - rank[i2]);
        for (int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                pq.offer(i);
            }
        }
        int answer = 0;
        int multiply = 10000;
        for (int i=0; i<3; i++) {
            answer += multiply * pq.poll();
            multiply /= 100;
        }
        return answer;
    }
}
