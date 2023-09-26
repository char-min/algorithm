package level0;

import java.util.ArrayList;
import java.util.List;

public class _68_할_일_목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answerList = new ArrayList<>();
        for (int i=0; i<todo_list.length; i++) {
            if (!finished[i]) {
                answerList.add(todo_list[i]);
            }
        }
        return answerList.toArray(new String[answerList.size()]);
    }
}
