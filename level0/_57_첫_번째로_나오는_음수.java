package level0;

public class _57_첫_번째로_나오는_음수 {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
