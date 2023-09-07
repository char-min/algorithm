package level0;

public class _19_조건_문자열 {
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
        StopWatch.end(); //19
    }

    public static int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals("<") && eq.equals("=")) {
            return n <= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")) {
            return n < m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("=")) {
            return n >= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            return n > m ? 1 : 0;
        }
        throw new IllegalArgumentException("parameter is invalid.");
    }
}
