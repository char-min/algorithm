package level0;

public class _48_문자열_뒤집기_2_slow {
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
        System.out.println(answer); //50
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));
        sb.reverse();
        return my_string.substring(0, s) + sb + my_string.substring(e+1);
    }
}
