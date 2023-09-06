package level0;

public class _13_문자열_곱하기 {
    public static void main(String[] args) {
        String my_string = "string";
        int k = 100000;
        StopWatch.start();
        String answer = solution(my_string, k);
//        System.out.println(answer);
        StopWatch.end(); //14

        StopWatch.start();
        String answer2 = solution2(my_string, k);
//        System.out.println(answer2);
        StopWatch.end(); //1
    }

    public static String solution2(String my_string, int k) {
        return my_string.repeat(k);
    }

    public static String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}
