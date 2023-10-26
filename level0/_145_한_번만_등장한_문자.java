package level0;

import java.util.*;

/*
테스트 1 〉	통과 (0.34ms, 77.4MB)
테스트 2 〉	통과 (0.46ms, 78.1MB)
테스트 3 〉	통과 (0.40ms, 75.1MB)
테스트 4 〉	통과 (0.43ms, 70.8MB)
테스트 5 〉	통과 (0.62ms, 77.3MB)
테스트 6 〉	통과 (0.31ms, 72MB)
테스트 7 〉	통과 (0.38ms, 75.5MB)
테스트 8 〉	통과 (0.34ms, 83.4MB)
테스트 9 〉	통과 (0.37ms, 71.4MB)
테스트 10 〉	통과 (0.32ms, 73MB)
 */
public class _145_한_번만_등장한_문자 {
    public String solution(String s) {
        Map<Character, Integer> cToCntMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            cToCntMap.put(c, cToCntMap.getOrDefault(c, 0) + 1);
        }
        List<Character> cList = new ArrayList<>();
        for (char c : cToCntMap.keySet()) {
            if (cToCntMap.get(c) == 1) {
                cList.add(c);
            }
        }
        Collections.sort(cList);
        StringBuilder sb = new StringBuilder();
        for (char c : cList) {
            sb.append(c);
        }
        return sb.toString();
    }
}
