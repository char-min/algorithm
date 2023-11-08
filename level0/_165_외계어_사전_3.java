package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
테스트 1 〉	통과 (12.15ms, 77MB)
테스트 2 〉	통과 (5.83ms, 67.8MB)
테스트 3 〉	통과 (8.69ms, 85.3MB)
테스트 4 〉	통과 (9.15ms, 77.9MB)
테스트 5 〉	통과 (4.12ms, 75MB)
테스트 6 〉	통과 (7.80ms, 78.8MB)
테스트 7 〉	통과 (5.04ms, 78.8MB)
테스트 8 〉	통과 (9.96ms, 79.4MB)
테스트 9 〉	통과 (4.48ms, 75.6MB)
 */
public class _165_외계어_사전_3 {
    public static void main(String[] args) {
//        String[] spell = {"p", "o", "s"};
//        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
//        String[] spell = {"z", "d", "x"};
//        String[] dic = {"def", "dww", "dzx", "loveaw"};
//        String[] spell = {"s", "o", "m", "d"};
//        String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};
        String[] spell = {"z", "d", "x"};
        String[] dic = {"zddx"};
        int answer = solution(spell, dic);
        System.out.println(answer);
    }

    public static int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic).map(s -> s.chars().sorted()
                .mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining()))
                .collect(Collectors.toList()).contains(Arrays.stream(spell).sorted().collect(Collectors.joining())) ? 1 : 2;
    }
}
