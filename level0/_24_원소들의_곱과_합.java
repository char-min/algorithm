package level0;

public class _24_원소들의_곱과_합 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int answer = solution(num_list);
        System.out.println(answer);
    }

    public static int solution(int[] num_list) {
        int multi = 1;
        int sum = 0;
        for (int num : num_list) {
            multi *= num;
            sum += num;
        }
        return multi < Math.pow(sum, 2) ? 1 : 0;
    }
}
