package level0;

public class _62_순서_바꾸기 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i=0, j=n; i<num_list.length; i++) {
            j = j == num_list.length ? 0 : j;
            answer[i] = num_list[j++];
        }
        return answer;
    }
}
