package level0;

import java.util.ArrayList;
import java.util.List;

public class _83_ad_제거하기 {
    public String[] solution(String[] strArr) {
        List<String> answerList = new ArrayList<>();
        for (String str : strArr) {
            if (!str.contains("ad")) {
                answerList.add(str);
            }
        }
        return answerList.toArray(new String[answerList.size()]);
    }
}
