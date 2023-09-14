package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
테스트 1 〉	통과 (14.78ms, 76.6MB)
테스트 2 〉	통과 (0.15ms, 80.2MB)
테스트 3 〉	통과 (0.18ms, 73.5MB)
테스트 4 〉	통과 (0.15ms, 72.3MB)
테스트 5 〉	통과 (0.17ms, 73.1MB)
테스트 6 〉	통과 (0.20ms, 76.8MB)
테스트 7 〉	통과 (0.18ms, 77.3MB)
테스트 8 〉	통과 (0.15ms, 75.2MB)
테스트 9 〉	통과 (0.13ms, 73.2MB)
테스트 10 〉	통과 (0.25ms, 71.9MB)
테스트 11 〉	통과 (0.15ms, 69.8MB)
테스트 12 〉	통과 (0.16ms, 86MB)
테스트 13 〉	통과 (0.16ms, 69.5MB)
테스트 14 〉	통과 (0.13ms, 76.8MB)
테스트 15 〉	통과 (0.12ms, 72.3MB)
테스트 16 〉	통과 (0.14ms, 72.6MB)
테스트 17 〉	통과 (0.16ms, 78MB)
테스트 18 〉	통과 (0.20ms, 75.2MB)
테스트 19 〉	통과 (0.17ms, 73.4MB)
테스트 20 〉	통과 (0.15ms, 65MB)
테스트 21 〉	통과 (0.20ms, 72.1MB)
테스트 22 〉	통과 (0.16ms, 72.6MB)
 */
public class _32_배열_만들기_2 {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        int[] answer = solution(l, r);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int l, int r) {
        int[] allNum = getAllNum();
        if (allNum[0] == -1) {
            return allNum; // {-1} 리턴
        }
        List<Integer> answerList = new ArrayList<>();
        for (int i=0; i<allNum.length; i++) {
            if (allNum[i] >= l && allNum[i] <= r) {
                answerList.add(allNum[i]);
            }
        }
        if (answerList.size() == 0) {
            return new int[]{-1};
        }
        int[] answer = new int[answerList.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    private static int[] getAllNum() {
        int l = 1, r = 1_000_000;
        int[] answer;
        int sDigit = getDigit(l);
        int eDigit = getDigit(r);
        List<Integer> result = new ArrayList<>();
        for (int i=sDigit; i<=eDigit; i++) {
            int start = 5 * (int)Math.pow(10, sDigit-1);
            if (start < l || start > r) {
                continue;
            }
            int e = result.size();
            result.add(start);
            sDigit++;
            boolean isBreak = false;
            for (int j=0; j<e; j++) {
                int next = start + result.get(j);
                if (next < l || next > r) {
                    isBreak = true;
                    break;
                }
                result.add(next);
            }
            if (isBreak) {
                break;
            }
        }
        if (result.size() == 0) {
            return new int[]{-1};
        }

        answer = new int[result.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    private static int getDigit(int num) {
        return String.valueOf(num).length();
    }
}
