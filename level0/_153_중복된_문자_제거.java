package level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
테스트 1 〉	통과 (1.87ms, 75MB)
테스트 2 〉	통과 (1.54ms, 72.9MB)
테스트 3 〉	통과 (2.46ms, 78.7MB)
테스트 4 〉	통과 (1.43ms, 77.3MB)
테스트 5 〉	통과 (1.64ms, 74.5MB)
테스트 6 〉	통과 (1.42ms, 68.1MB)
테스트 7 〉	통과 (1.44ms, 75.5MB)
 */
public class _153_중복된_문자_제거 {
    public String solution(String my_string) {
        List<Character> filteredList = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (!filteredList.contains(c)) {
                filteredList.add(c);
            }
        }
        return filteredList.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
