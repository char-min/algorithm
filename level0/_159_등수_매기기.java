package level0;

import java.util.*;

/*
테스트 1 〉	통과 (0.46ms, 73.3MB)
테스트 2 〉	통과 (0.72ms, 75.6MB)
테스트 3 〉	통과 (1.18ms, 71.2MB)
테스트 4 〉	통과 (0.42ms, 78.6MB)
테스트 5 〉	통과 (0.43ms, 76.6MB)
테스트 6 〉	통과 (0.44ms, 80.1MB)
테스트 7 〉	통과 (0.44ms, 73.9MB)
테스트 8 〉	통과 (0.45ms, 75.6MB)
테스트 9 〉	통과 (0.44ms, 83.9MB)
테스트 10 〉	통과 (1.32ms, 75.2MB)
테스트 11 〉	통과 (0.45ms, 71.6MB)
테스트 12 〉	통과 (0.63ms, 75.3MB)
 */
public class _159_등수_매기기 {
    public static void main(String[] args) {
        int[][] score = {{1, 1}};
        int[] answer = solution(score);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[][] score) {
        List<Float> scoreList = new ArrayList<>();
        Map<Float, Integer> scoreCntMap = new HashMap<>();
        Map<Float, Integer> scoreMap = new HashMap<>();
        float[] average = new float[score.length];
        for (int i=0; i<average.length; i++) {
            average[i] = (score[i][0] + (float)score[i][1]) / 2;
            scoreCntMap.put(average[i], scoreCntMap.getOrDefault(average[i], 0) + 1);
            if (!scoreList.contains(average[i])) {
                scoreList.add(average[i]);
            }
        }
        Collections.sort(scoreList, Comparator.reverseOrder());
        int grade = 1;
        for (int i=0; i<scoreList.size(); i++) {
            float _score = scoreList.get(i);
            scoreMap.put(_score, grade);
            grade += scoreCntMap.get(_score);
        }
        int[] answer = new int[average.length];
        for (int i=0; i<answer.length; i++) {
            answer[i] = scoreMap.get(average[i]);
        }
        return answer;
    }
}
