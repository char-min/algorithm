package level0;

import java.util.HashMap;
import java.util.Map;

/*
테스트 1 〉	통과 (13.31ms, 122MB)
테스트 2 〉	통과 (0.25ms, 73MB)
테스트 3 〉	통과 (15.31ms, 117MB)
테스트 4 〉	통과 (22.00ms, 126MB)
테스트 5 〉	통과 (15.37ms, 127MB)
테스트 6 〉	통과 (5.15ms, 96.1MB)
테스트 7 〉	통과 (15.66ms, 116MB)
테스트 8 〉	통과 (6.17ms, 101MB)
테스트 9 〉	통과 (14.52ms, 97.4MB)
테스트 10 〉	통과 (1.99ms, 91.6MB)
테스트 11 〉	통과 (2.19ms, 81.2MB)
테스트 12 〉	통과 (10.78ms, 120MB)
테스트 13 〉	통과 (15.74ms, 124MB)
테스트 14 〉	통과 (6.14ms, 85.6MB)
테스트 15 〉	통과 (10.41ms, 103MB)
테스트 16 〉	통과 (6.04ms, 99.7MB)
테스트 17 〉	통과 (11.73ms, 114MB)
테스트 18 〉	통과 (7.43ms, 102MB)
테스트 19 〉	통과 (26.37ms, 111MB)
테스트 20 〉	통과 (13.57ms, 116MB)
테스트 21 〉	통과 (16.28ms, 105MB)
테스트 22 〉	통과 (18.36ms, 110MB)
테스트 23 〉	통과 (12.96ms, 101MB)
테스트 24 〉	통과 (21.44ms, 134MB)
 */
public class _98_문자열_묶기 {
    public int solution(String[] strArr) {
        Map<Integer, Integer> wordToCntMap = new HashMap<>();
        for (int i=0; i<strArr.length; i++) {
            int len = strArr[i].length();
            wordToCntMap.put(len, wordToCntMap.getOrDefault(len, 0));
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : wordToCntMap.entrySet()) {
            max = Math.max(entry.getValue(), max);
        }
        return max;
    }
}
