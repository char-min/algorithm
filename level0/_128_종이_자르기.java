package level0;

public class _128_종이_자르기 {
    public int solution(int M, int N) {
        int min = Math.min(M, N);
        int max = Math.max(M, N);
        int answer = (min - 1) * (min + 1) + min * (max - min);
        return answer;
    }
}
