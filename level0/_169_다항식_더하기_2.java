package level0;

/*
테스트 1 〉	통과 (10.09ms, 80.8MB)
테스트 2 〉	통과 (10.57ms, 75.4MB)
테스트 3 〉	통과 (5.68ms, 68.3MB)
테스트 4 〉	통과 (13.14ms, 87.8MB)
테스트 5 〉	통과 (9.16ms, 75.5MB)
테스트 6 〉	통과 (12.02ms, 80.3MB)
테스트 7 〉	통과 (12.24ms, 73.8MB)
테스트 8 〉	통과 (10.58ms, 77.6MB)
테스트 9 〉	통과 (10.45ms, 74.6MB)
테스트 10 〉	통과 (1.84ms, 76.2MB)
테스트 11 〉	통과 (8.32ms, 73.9MB)
테스트 12 〉	통과 (10.68ms, 81.1MB)
 */
public class _169_다항식_더하기_2 {
    public String solution(String polynomial) {
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
        return (one != 0 ? one > 1 ? one + "x" : "x" : "")
                + (zero != 0 ? (one != 0 ? " + " : "") + zero : one != 0 ? "" : zero);
    }
}
