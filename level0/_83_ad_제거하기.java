package level0;

import java.util.ArrayList;
import java.util.List;

public class _83_ad_제거하기 {
    public static void main(String[] args) {
        String str = "notad".replaceAll("ad", "");
        System.out.println(str);
    }

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
