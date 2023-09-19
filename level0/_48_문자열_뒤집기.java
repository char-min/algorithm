package level0;

public class _48_문자열_뒤집기 {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<1000; i++) {
            sb.append(my_string);
        }
        my_string = sb.toString();
        int s = 0;
        int e = 13 * 1000;
        StopWatch.start();
        String answer = solution(my_string, s, e);
        StopWatch.end();
        System.out.println(answer);
    }

    public static String solution(String my_string, int s, int e) {
        char[] charArray = my_string.toCharArray();
        for (int i=s, j=e; i<j; i++, j--) {
            char tmp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = tmp;
        }
        return new String(charArray);
    }
}
