package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.07ms, 75.4MB)
테스트 2 〉	통과 (0.25ms, 71.6MB)
테스트 3 〉	통과 (0.05ms, 81.2MB)
테스트 4 〉	통과 (0.12ms, 79.7MB)
테스트 5 〉	통과 (0.08ms, 73.4MB)
테스트 6 〉	통과 (0.15ms, 67.5MB)
테스트 7 〉	통과 (0.10ms, 74.6MB)
테스트 8 〉	통과 (0.23ms, 73.7MB)
테스트 9 〉	통과 (0.18ms, 76.8MB)
테스트 10 〉	통과 (0.19ms, 76MB)
테스트 11 〉	통과 (0.04ms, 76.8MB)
테스트 12 〉	통과 (0.09ms, 77.9MB)
테스트 13 〉	통과 (0.13ms, 70.2MB)
테스트 14 〉	통과 (0.12ms, 78.8MB)
테스트 15 〉	통과 (0.05ms, 75.1MB)
테스트 16 〉	통과 (0.09ms, 72.3MB)
테스트 17 〉	통과 (0.17ms, 73.2MB)
테스트 18 〉	통과 (0.21ms, 76.9MB)
테스트 19 〉	통과 (0.16ms, 75.8MB)
테스트 20 〉	통과 (0.13ms, 76.5MB)
테스트 21 〉	통과 (0.30ms, 79.8MB)
테스트 22 〉	통과 (0.31ms, 72.5MB)
테스트 23 〉	통과 (0.04ms, 73.6MB)
테스트 24 〉	통과 (0.03ms, 71.6MB)
 */
public class _117_그림_확대_2 {
    public static void main(String[] args) {
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;
        String[] answer = solution(picture, k);
        System.out.println(Arrays.toString(answer));
    }

    public static String[] solution(String[] picture, int k) {
        StringBuilder sbDot = new StringBuilder();
        StringBuilder sbX = new StringBuilder();
        for (int i=0; i<k; i++) {
            sbDot.append(".");
            sbX.append("x");
        }
        String dot = sbDot.toString();
        String x = sbX.toString();
        String[] answer = new String[picture.length * k];
        int idx = 0;
        for (String p : picture) {
            String newP = p.replace(".", dot).replace("x", x);
            for (int i=0; i<k; i++) {
                answer[idx++] = newP;
            }
        }
        return answer;
    }
}
