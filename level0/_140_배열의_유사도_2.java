package level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
테스트 1 〉	통과 (0.67ms, 74.7MB)
테스트 2 〉	통과 (1.17ms, 70.7MB)
테스트 3 〉	통과 (1.55ms, 71.4MB)
테스트 4 〉	통과 (1.73ms, 73MB)
테스트 5 〉	통과 (0.97ms, 79.9MB)
테스트 6 〉	통과 (0.68ms, 72.9MB)
테스트 7 〉	통과 (1.12ms, 79.9MB)
테스트 8 〉	통과 (1.08ms, 77.2MB)
 */
public class _140_배열의_유사도_2 {
    public int solution(String[] s1, String[] s2) {
        Set<String> s2Set = new HashSet<>(Arrays.asList(s2));
        return (int)Arrays.stream(s1).filter(s2Set::contains).count();
    }
}
