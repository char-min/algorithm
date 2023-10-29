package level0;

import java.util.*;

/*
테스트 1 〉	통과 (0.37ms, 70.3MB)
테스트 2 〉	통과 (0.54ms, 87.3MB)
테스트 3 〉	통과 (0.32ms, 77.1MB)
테스트 4 〉	통과 (0.27ms, 71.5MB)
테스트 5 〉	통과 (0.27ms, 72.7MB)
테스트 6 〉	통과 (0.37ms, 75MB)
테스트 7 〉	통과 (0.37ms, 74.8MB)
테스트 8 〉	통과 (0.29ms, 72.7MB)
테스트 9 〉	통과 (0.30ms, 73.6MB)
테스트 10 〉	통과 (0.28ms, 71.2MB)
테스트 11 〉	통과 (0.46ms, 75.6MB)
테스트 12 〉	통과 (0.40ms, 73.6MB)
 */
public class _159_등수_매기기_2 {
    public static void main(String[] args) {
        int[][] score = {{1, 1}};
        int[] answer = solution(score);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[][] score) {
        int[] sumArr = new int[score.length];
        List<Integer> scoreList = new ArrayList<>();
        for (int i=0; i<score.length; i++) {
            sumArr[i] = score[i][0] + score[i][1];
            scoreList.add(sumArr[i]);
        }
        Collections.sort(scoreList, Comparator.reverseOrder());
        int[] answer = new int[score.length];
        for (int i=0; i<answer.length; i++) {
            answer[i] = scoreList.indexOf(sumArr[i]) + 1;
        }
        return answer;
    }
}
