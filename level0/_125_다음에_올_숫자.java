package level0;

public class _125_다음에_올_숫자 {
    public int solution(int[] common) {
        int a1 = common[0], a2 = common[1], a3 = common[2];
        if (a2 - a1 == a3 - a2) {
            return common[common.length-1] + a2 - a1;
        } else {
            return common[common.length-1] * (a2 / a1);
        }
    }
}
