package level0;

public class _65_n개_간격의_원소들 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length-1)/n + 1];
        for (int i=0, j=0; i<num_list.length; i+=n) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}
