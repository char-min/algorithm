package level0;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
테스트 1 〉	통과 (0.88ms, 73.2MB)
테스트 2 〉	통과 (1.11ms, 89.8MB)
테스트 3 〉	통과 (1.23ms, 76.3MB)
테스트 4 〉	통과 (0.45ms, 78.6MB)
테스트 5 〉	통과 (0.52ms, 75.8MB)
테스트 6 〉	통과 (0.48ms, 79.7MB)
테스트 7 〉	통과 (0.43ms, 71.6MB)
 */
public class _153_중복된_문자_제거_3 {
    public String solution(String my_string) {
        //LinkedHashSet : 넣은 순서를 보장하는 set.
        Set<String> filteredSet = new LinkedHashSet<>(List.of(my_string.split("")));
        return String.join("", filteredSet);
    }
}
