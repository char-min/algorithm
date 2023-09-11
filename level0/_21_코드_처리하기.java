package level0;

public class _21_코드_처리하기 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        String answer = solution(code);
        System.out.println(answer);
        System.out.println(Character.getNumericValue('1'));
    }

    public final static char signal = '1';
    public final static char mode_1 = '1';
    public final static char mode_0 = '0';

    public static String solution(String code) {
        StringBuilder sb = new StringBuilder();
        char mode = mode_0;
        for (int i=0; i<code.length(); i++) {
            char c = code.charAt(i);
            if (c == signal) {
                mode = changeMode(mode);
                continue;
            }
            if (i % 2 == Character.getNumericValue(mode)) {
                sb.append(c);
            }
        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }

    public static char changeMode(char mode) {
        return mode == mode_0 ? mode_1 : mode_0;
    }
}
