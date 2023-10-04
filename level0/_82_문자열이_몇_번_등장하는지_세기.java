package level0;

public class _82_문자열이_몇_번_등장하는지_세기 {
    public int solution(String myString, String pat) {
        int cnt = 0;
        int idx = 0;
        while (true) {
            idx = myString.indexOf(pat, idx);
            if (idx == -1) {
                break;
            }
            idx++;
            cnt++;
        }
        return cnt;
    }
}
