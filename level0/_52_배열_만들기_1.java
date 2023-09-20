package level0;

public class _52_배열_만들기_1 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for (int i=0; i<answer.length; i++) {
            answer[i] = k * (i+1);
        }
        return answer;
    }
}
