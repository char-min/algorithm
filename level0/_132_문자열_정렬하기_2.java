package level0;

import java.util.Arrays;

public class _132_문자열_정렬하기_2 {
    public String solution(String my_string) {
        char[] answerArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(answerArr);
        return new String(answerArr);
    }
}
