package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
테스트 1 〉	통과 (2.99ms, 76.3MB)
테스트 2 〉	통과 (5.22ms, 76.7MB)
테스트 3 〉	통과 (3.76ms, 76.6MB)
테스트 4 〉	통과 (2.89ms, 78.3MB)
테스트 5 〉	통과 (3.42ms, 66.7MB)
테스트 6 〉	통과 (3.22ms, 73.7MB)
테스트 7 〉	통과 (4.49ms, 89MB)
테스트 8 〉	통과 (5.50ms, 70.9MB)
테스트 9 〉	통과 (4.17ms, 75.3MB)
 */
public class _165_외계어_사전_2 {
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
        return Arrays.stream(dic).map(word -> Arrays.stream(word.split("")).sorted().collect(Collectors.joining()))
                .anyMatch(str -> str.equals(Arrays.stream(spell).sorted().collect(Collectors.joining()))) ? 1 : 2;
    }
}
