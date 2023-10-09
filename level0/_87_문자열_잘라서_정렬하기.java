package level0;

import java.util.Arrays;

public class _87_문자열_잘라서_정렬하기 {
    public String[] solution(String myString) {
        String[] splitted = myString.split("x+");
        String[] answer = null;
        int i=0;
        if (myString.startsWith("x")) {
            answer = new String[splitted.length-1];
            i=1;
        } else {
            answer = new String[splitted.length];
        }
        for (int j=0; i<splitted.length; j++) {
            answer[j] = splitted[i++];
        }
        Arrays.sort(answer);
        return answer;
    }
}
