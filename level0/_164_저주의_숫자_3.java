package level0;

/*
테스트 1 〉	통과 (0.05ms, 76.5MB)
테스트 2 〉	통과 (0.03ms, 73.9MB)
테스트 3 〉	통과 (0.04ms, 70.6MB)
테스트 4 〉	통과 (0.03ms, 76.2MB)
테스트 5 〉	통과 (0.03ms, 81.7MB)
테스트 6 〉	통과 (0.03ms, 74.9MB)
테스트 7 〉	통과 (0.05ms, 75.4MB)
테스트 8 〉	통과 (0.05ms, 80.3MB)
테스트 9 〉	통과 (0.03ms, 68.6MB)
테스트 10 〉	통과 (0.04ms, 84.2MB)
테스트 11 〉	통과 (0.03ms, 72.6MB)
 */
public class _164_저주의_숫자_3 {
    public static void main(String[] args) {
        int n = 15;
        int answer = solution(n);
        System.out.println(answer);
    }

    public static int solution(int n) {
        int[] nums = new int[101];
        int num = 1;
        int i = 1;
        while (i <= 100) {
            if (num % 3 == 0 || isContain3(num)) {
                num++;
                continue;
            }
            nums[i++] = num++;
        }
        return nums[n];
    }

    private static boolean isContain3(int num) {
        while (num > 0) {
            int remain = num % 10;
            if (remain == 3) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
