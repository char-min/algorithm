package level0;

/*
테스트 1 〉	통과 (0.12ms, 75.6MB)
테스트 2 〉	통과 (1.18ms, 78.3MB)
테스트 3 〉	통과 (0.10ms, 75.2MB)
테스트 4 〉	통과 (0.01ms, 86.5MB)
테스트 5 〉	통과 (0.13ms, 75.1MB)
테스트 6 〉	통과 (0.51ms, 78.1MB)
테스트 7 〉	통과 (0.40ms, 76.2MB)
테스트 8 〉	통과 (0.16ms, 70.9MB)
테스트 9 〉	통과 (0.35ms, 77.3MB)
 */
public class _165_외계어_사전 {
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
        for (int i=0; i<dic.length; i++) {
            String word = dic[i];
            if (word.length() < spell.length) {
                continue;
            }
            for (int j=0; j<spell.length; j++) {
                word = word.replaceFirst(spell[j], "");
            }
            if (word.length() == 0) {
                return 1;
            }
        }
        return 2;
    }
}
