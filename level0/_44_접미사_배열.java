package level0;

import java.util.Arrays;

public class _44_접미사_배열 {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i=0; i<my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
