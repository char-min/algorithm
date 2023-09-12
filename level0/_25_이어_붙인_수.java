package level0;

public class _25_이어_붙인_수 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int answer = solution(num_list);
        System.out.println(answer);
    }

    public static int solution(int[] num_list) {
        int[] sums = {0, 0};
        for (int num : num_list) {
            int idx = num % 2;
            sums[idx] = sums[idx] * 10 + num;
        }
        return sums[0] + sums[1];
    }
}
