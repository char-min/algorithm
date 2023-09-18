package level0;

import java.util.Arrays;

public class _37_주사위_게임_3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;
        int answer = solution(a, b, c, d);
        System.out.println(answer);
    }

    public static int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        if (arr[0] == arr[3]) {
            return 1111 * arr[0];
        } else if (arr[0] == arr[2] || arr[1] == arr[3]) {
            return (int)Math.pow(10 * arr[1] + arr[0] + arr[3] - arr[1], 2);
        } else if (arr[0] == arr[1] && arr[2] == arr[3]) {
            return (arr[0] + arr[2]) * (arr[2] - arr[0]);
        } else if (arr[0] == arr[1]) {
            return arr[2] * arr[3];
        } else if (arr[1] == arr[2]) {
            return arr[0] * arr[3];
        } else if (arr[2] == arr[3]) {
            return arr[0] * arr[1];
        } else {
            return arr[0];
        }
    }
}
