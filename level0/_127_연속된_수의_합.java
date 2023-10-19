package level0;

public class _127_연속된_수의_합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int a = (total - num * (num - 1) / 2) / num;
        for (int i=0; i<num ; i++) {
            answer[i] = a++;
        }
        return answer;
    }
}
