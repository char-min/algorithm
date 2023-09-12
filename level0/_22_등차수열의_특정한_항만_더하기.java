package level0;

import sample._1.StopWatch;

public class _22_등차수열의_특정한_항만_더하기 {
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};
        StopWatch.start();
        int answer = solution(a, d, included);
        StopWatch.end();
        System.out.println(answer);
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i=0; i<included.length; i++) {
            if (included[i]) {
                answer += a + i * d;
            }
        }
        return answer;
    }
}
