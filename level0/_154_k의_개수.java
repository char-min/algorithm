package level0;

/*
테스트 1 〉	통과 (5.32ms, 72.9MB)
테스트 2 〉	통과 (0.02ms, 75MB)
테스트 3 〉	통과 (0.02ms, 77.3MB)
테스트 4 〉	통과 (0.83ms, 79.9MB)
테스트 5 〉	통과 (0.68ms, 75.2MB)
테스트 6 〉	통과 (0.02ms, 75.2MB)
테스트 7 〉	통과 (0.18ms, 76.8MB)
테스트 8 〉	통과 (1.54ms, 75.9MB)
 */
public class _154_k의_개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int t=i; t<=j; t++) {
            answer += count(t, k);
        }
        return answer;
    }

    private int count(int num, int k) {
        if (num == 0 && k == 0) {
            return 1;
        }
        int rtn = 0;
        while (num > 0) {
            if (num % 10 == k) {
                rtn++;
            }
            num /= 10;
        }
        return rtn;
    }
}
