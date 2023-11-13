package level0;

/*
테스트 1 〉	통과 (0.33ms, 73.5MB)
테스트 2 〉	통과 (0.25ms, 74.5MB)
테스트 3 〉	통과 (0.31ms, 77.4MB)
테스트 4 〉	통과 (0.23ms, 78.5MB)
테스트 5 〉	통과 (0.19ms, 76.8MB)
테스트 6 〉	통과 (0.14ms, 72.1MB)
테스트 7 〉	통과 (0.15ms, 72.4MB)
테스트 8 〉	통과 (0.22ms, 79.2MB)
테스트 9 〉	통과 (0.22ms, 74.5MB)
테스트 10 〉	통과 (0.15ms, 75.4MB)
테스트 11 〉	통과 (0.23ms, 75.6MB)
테스트 12 〉	통과 (0.29ms, 72.1MB)
 */
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
        if (one == 0 && zero == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if (one != 0) {
            if (one != 1) {
                sb.append(one);
            }
            sb.append("x");
        }
        if (one != 0 && zero != 0) {
            sb.append(" + ");
        }
        if (zero != 0) {
            sb.append(zero);
        }
        return sb.toString();
    }
}
