package level0;

public class _139_숫자_찾기 {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        int idx = numStr.indexOf(kStr);
        return idx == -1 ? -1 : idx + 1;
    }
}
