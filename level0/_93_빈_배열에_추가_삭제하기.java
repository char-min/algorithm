package level0;

import java.util.ArrayList;
import java.util.List;

public class _93_빈_배열에_추가_삭제하기 {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answerList = new ArrayList<>();
        for (int i=0; i<flag.length; i++) {
            if (flag[i]) {
                for (int j=0; j<arr[i] * 2; j++) {
                    answerList.add(arr[i]);
                }
            } else {
                for (int j=0; j<arr[i]; j++) {
                    answerList.remove(answerList.size()-1);
                }
            }
        }
        return answerList.stream().mapToInt(Integer::valueOf).toArray();
    }
}
