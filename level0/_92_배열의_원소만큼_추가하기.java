package level0;

import java.util.ArrayList;
import java.util.List;

public class _92_배열의_원소만큼_추가하기 {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        for (int a : arr) {
            for (int i=0; i<a; i++) {
                answerList.add(a);
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
