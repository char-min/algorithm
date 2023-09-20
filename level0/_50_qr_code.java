package level0;

public class _50_qr_code {
    public String solution(int q, int r, String code) {
        int codeLen = code.length();
        char[] charArray = new char[codeLen / q + (codeLen % q > r ? 1 : 0)];
        for (int i=0, j=0; i<codeLen; i++) {
            if (i % q == r) {
                charArray[j++] = code.charAt(i);
            }
        }
        return new String(charArray);
    }
}
