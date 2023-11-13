package level0;

/*
테스트 1 〉	통과 (10.43ms, 77.9MB)
테스트 2 〉	통과 (13.53ms, 80.2MB)
테스트 3 〉	통과 (6.07ms, 76.8MB)
테스트 4 〉	통과 (12.11ms, 78MB)
테스트 5 〉	통과 (12.46ms, 76.2MB)
테스트 6 〉	통과 (9.62ms, 75.2MB)
테스트 7 〉	통과 (10.44ms, 79.5MB)
테스트 8 〉	통과 (11.85ms, 70.1MB)
테스트 9 〉	통과 (11.48ms, 73.1MB)
테스트 10 〉	통과 (1.51ms, 76.6MB)
테스트 11 〉	통과 (6.40ms, 76.9MB)
테스트 12 〉	통과 (9.81ms, 80.4MB)
 */
public class _169_다항식_더하기_3 {
    public String solution(String polynomial) {
        String[] elms = polynomial.split(" ");
        int one = 0;
        int zero = 0;
        for (String elm : elms) {
            if (elm.charAt(elm.length()-1) == 'x') {
                String num = elm.substring(0, elm.length()-1);
                one += num.equals("") ? 1 : Integer.parseInt(num);
            } else if (!elm.equals("+")){
                zero += Integer.parseInt(elm);
            }
        }
        return (one != 0 ? one > 1 ? one + "x" : "x" : "")
                + (zero != 0 ? (one != 0 ? " + " : "") + zero : one != 0 ? "" : zero);
    }
}
