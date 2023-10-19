package level0;

public class _125_옹알이_1 {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        int answer = solution(babbling);
        System.out.println(answer);
    }

    public static int solution(String[] babbling) {
        int cnt = 0;
        for (String word : babbling) {
            cnt += word.matches("(aya|ye|woo|ma)+") ? 1 : 0;
        }
        return cnt;
    }
}
