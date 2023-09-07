package level0;

import java.util.Map;
import java.util.function.BiFunction;

public class _19_조건_문자열_2_slow {
    public static void main(String[] args) {
        String ineq = "<";
        String eq = "=";
        int n = 20;
        int m = 50;
        StopWatch.start();
        for (int i=0; i<100000000; i++) {
            int answer = solution(ineq, eq, n, m);
//            System.out.println(answer);
        }
        StopWatch.end(); //18883
    }

    public static int solution(String ineq, String eq, int n, int m) {
        Map<String, BiFunction<Integer, Integer, Boolean>> biFunc = Map.of(
            ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );
        return biFunc.get(ineq + eq).apply(n, m) ? 1 : 0;
    }
}
