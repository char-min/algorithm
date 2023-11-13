package level0;

import java.util.Arrays;

public class _169_다항식_더하기 {
    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";
        String answer = solution(polynomial);
        System.out.println(answer);
    }

    public static String solution(String polynomial) {
        String[] elms = polynomial.split(" \\+ ");
        int one = 0;
        int zero = 0;
        for (String elm : elms) {
            if (elm.charAt(elm.length()-1) == 'x') {
                String num = elm.substring(0, elm.length()-1);
                one += num.equals("") ? 1 : Integer.parseInt(num);
            } else {
                zero += Integer.parseInt(elm);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (one != 0) {
            sb.append(one)
                    .append("x");
        }
        if (zero != 0) {
            sb.append(" + ")
                    .append(zero);
        }
        return sb.toString();
    }
}
