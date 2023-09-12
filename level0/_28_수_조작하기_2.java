package level0;

public class _28_수_조작하기_2 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String answer = solution(numLog);
        System.out.println(answer);
    }

    public static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<numLog.length-1; i++) {
            switch (numLog[i+1] - numLog[i]) {
                case (1):
                    sb.append("w");
                    break;
                case (-1):
                    sb.append("s");
                    break;
                case (10):
                    sb.append("d");
                    break;
                case (-10):
                    sb.append("a");
                    break;
            }
        }
        return sb.toString();
    }
}
