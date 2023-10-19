package level0;

public class _130_잘라서_배열로_저장하기 {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() + n - 1)/n];
        int sIdx = 0;
        for (int i=0; i<answer.length; i++) {
            int eIdx = sIdx + n;
            answer[i] = my_str.substring(sIdx, eIdx > my_str.length() ? my_str.length() : eIdx);
            sIdx = eIdx;
        }
        return answer;
    }
}
