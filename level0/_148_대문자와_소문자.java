package level0;

/*
테스트 1 〉	통과 (0.06ms, 75.5MB)
테스트 2 〉	통과 (0.05ms, 82.7MB)
테스트 3 〉	통과 (0.05ms, 75.4MB)
테스트 4 〉	통과 (0.07ms, 77.1MB)
테스트 5 〉	통과 (0.45ms, 74.1MB)
테스트 6 〉	통과 (0.53ms, 73MB)
테스트 7 〉	통과 (0.58ms, 74.7MB)
 */
public class _148_대문자와_소문자 {
    public String solution(String my_string) {
        char[] cArray = my_string.toCharArray();
        for (int i=0; i<cArray.length; i++) {
            cArray[i] = Character.isUpperCase(cArray[i]) ? Character.toLowerCase(cArray[i]) : Character.toUpperCase(cArray[i]);
        }
        return new String(cArray);
    }
}
