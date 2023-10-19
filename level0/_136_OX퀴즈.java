package level0;

import java.util.StringTokenizer;

/*
테스트 1 〉	통과 (0.10ms, 77.3MB)
테스트 2 〉	통과 (0.17ms, 67.8MB)
테스트 3 〉	통과 (0.13ms, 78.4MB)
테스트 4 〉	통과 (0.14ms, 73.2MB)
테스트 5 〉	통과 (0.12ms, 79.9MB)
테스트 6 〉	통과 (0.08ms, 75MB)
테스트 7 〉	통과 (0.09ms, 79.8MB)
테스트 8 〉	통과 (0.16ms, 75.1MB)
테스트 9 〉	통과 (0.13ms, 75.3MB)
테스트 10 〉	통과 (0.19ms, 81.7MB)
테스트 11 〉	통과 (0.15ms, 76.7MB)
테스트 12 〉	통과 (0.13ms, 75.9MB)
테스트 13 〉	통과 (0.13ms, 73.8MB)
테스트 14 〉	통과 (0.20ms, 76.1MB)
테스트 15 〉	통과 (0.16ms, 74.1MB)
테스트 16 〉	통과 (0.12ms, 76.4MB)
테스트 17 〉	통과 (0.08ms, 74.7MB)
 */
public class _136_OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i=0; i<quiz.length; i++) {
            StringTokenizer st = new StringTokenizer(quiz[i], " ");
            int X = Integer.parseInt(st.nextToken());
            String op = st.nextToken();
            int Y = Integer.parseInt(st.nextToken());
            st.nextToken();
            int Z = Integer.parseInt(st.nextToken());
            int result = 0;
            switch (op) {
                case "+":
                    result = X + Y;
                    break;
                case "-":
                    result = X - Y;
            }
            answer[i] = result == Z ? "O" : "X";
        }
        return answer;
    }
}
