package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _41_배열_만들기_5 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        int[] answer = solution(intStrs, k, s, l);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answerList = new ArrayList<>();
        for (String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s+l));
            if (num > k) {
                answerList.add(num);
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
