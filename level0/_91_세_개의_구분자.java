package level0;

import java.util.ArrayList;
import java.util.List;

/*
테스트 1 〉	통과 (51.42ms, 105MB)
테스트 2 〉	통과 (45.25ms, 110MB)
테스트 3 〉	통과 (14.55ms, 92.3MB)
테스트 4 〉	통과 (15.11ms, 75.9MB)
테스트 5 〉	통과 (27.85ms, 105MB)
테스트 6 〉	통과 (31.15ms, 97.1MB)
테스트 7 〉	통과 (27.08ms, 89.1MB)
테스트 8 〉	통과 (49.14ms, 98.4MB)
테스트 9 〉	통과 (31.64ms, 94.3MB)
테스트 10 〉	통과 (52.37ms, 113MB)
테스트 11 〉	통과 (42.87ms, 113MB)
 */
public class _91_세_개의_구분자 {
    public String[] solution(String myStr) {
        List<String> answerList = new ArrayList<>();
        String[] splitted = myStr.split("[a|b|c]");
        for (String str : splitted) {
            if (str.length() > 0) {
                answerList.add(str);
            }
        }
        String[] answer = answerList.toArray(new String[answerList.size()]);
        if (answer.length == 0) {
            answer = new String[]{"EMPTY"};
        }
        return answer;
    }
}
