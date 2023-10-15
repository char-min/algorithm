package level0;

import java.math.BigInteger;

/*
테스트 1 〉	통과 (0.06ms, 67.5MB)
테스트 2 〉	통과 (1.34ms, 65MB)
테스트 3 〉	통과 (3.19ms, 78.7MB)
테스트 4 〉	통과 (14.01ms, 67.6MB)
테스트 5 〉	통과 (84.37ms, 88MB)
테스트 6 〉	통과 (0.20ms, 76.6MB)
테스트 7 〉	통과 (1.69ms, 71.8MB)
테스트 8 〉	통과 (4.27ms, 77.5MB)
테스트 9 〉	통과 (24.96ms, 77.5MB)
테스트 10 〉	통과 (74.84ms, 78.8MB)
테스트 11 〉	통과 (1.97ms, 66MB)
테스트 12 〉	통과 (2.70ms, 72.9MB)
테스트 13 〉	통과 (4.41ms, 80.3MB)
테스트 14 〉	통과 (5.68ms, 79.2MB)
테스트 15 〉	통과 (87.89ms, 92.9MB)
테스트 16 〉	통과 (22.99ms, 77.9MB)
테스트 17 〉	통과 (10.20ms, 85MB)
테스트 18 〉	통과 (4.43ms, 82.3MB)
테스트 19 〉	통과 (24.46ms, 84.2MB)
테스트 20 〉	통과 (56.35ms, 80.4MB)
테스트 21 〉	통과 (49.96ms, 92.3MB)
테스트 22 〉	통과 (83.83ms, 74.3MB)
테스트 23 〉	통과 (81.62ms, 96.4MB)
테스트 24 〉	통과 (79.24ms, 89.4MB)
테스트 25 〉	통과 (88.97ms, 84.4MB)
테스트 26 〉	통과 (116.90ms, 92.2MB)
테스트 27 〉	통과 (112.26ms, 80.6MB)
테스트 28 〉	통과 (114.56ms, 92.8MB)
테스트 29 〉	통과 (132.19ms, 88.5MB)
테스트 30 〉	통과 (105.37ms, 88.3MB)
테스트 31 〉	통과 (114.32ms, 94.8MB)
 */
public class _107_두_수의_합_2 {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int aLen = a.length();
        int bLen = b.length();
        int max = Math.max(aLen, bLen);
        int carry = 0;
        for (int i=1; i<=max; i++) {
            int aCurr = 0;
            int bCurr = 0;
            if (i <= aLen) {
                aCurr = Character.digit(aArr[aLen-i], 10);
            }
            if (i <= bLen) {
                bCurr = Character.digit(bArr[bLen-i], 10);
            }
            int sum = aCurr + bCurr + carry;
            int result = sum % 10;
            sb.insert(0, result);
            carry = sum / 10;
        }
        if (carry == 1) {
            sb.insert(0, carry);
        }
        return sb.toString();
    }
}
