package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.04ms, 75.4MB)
테스트 2 〉	통과 (0.06ms, 81.9MB)
테스트 3 〉	통과 (0.03ms, 77.4MB)
테스트 4 〉	통과 (0.05ms, 79.1MB)
테스트 5 〉	통과 (0.04ms, 77.6MB)
테스트 6 〉	통과 (0.05ms, 71.4MB)
테스트 7 〉	통과 (0.03ms, 76.5MB)
테스트 8 〉	통과 (0.10ms, 78.1MB)
테스트 9 〉	통과 (0.06ms, 77.8MB)
테스트 10 〉	통과 (0.06ms, 77MB)
테스트 11 〉	통과 (0.02ms, 77MB)
테스트 12 〉	통과 (0.03ms, 75MB)
테스트 13 〉	통과 (0.04ms, 77.2MB)
테스트 14 〉	통과 (0.03ms, 77.4MB)
테스트 15 〉	통과 (0.03ms, 79.2MB)
테스트 16 〉	통과 (0.04ms, 77MB)
테스트 17 〉	통과 (0.10ms, 78.8MB)
테스트 18 〉	통과 (0.09ms, 82.4MB)
테스트 19 〉	통과 (0.07ms, 75.7MB)
테스트 20 〉	통과 (0.04ms, 79.5MB)
테스트 21 〉	통과 (0.21ms, 81.4MB)
테스트 22 〉	통과 (0.23ms, 73.8MB)
테스트 23 〉	통과 (0.02ms, 73.4MB)
테스트 24 〉	통과 (0.02ms, 73.6MB)
 */
public class _117_그림_확대 {
    public static void main(String[] args) {
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;
        String[] answer = solution(picture, k);
        System.out.println(Arrays.toString(answer));
    }

    public static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        for (String p : picture) {
            char[] cArr = new char[p.length() * k];
            int i=0;
            for (char c : p.toCharArray()) {
                for (int j=0; j<k; j++) {
                    cArr[i++] = c;
                }
            }
            String newP = new String(cArr);
            for (int j=0; j<k; j++) {
                answer[idx++] = newP;
            }
        }
        return answer;
    }
}
