package level0;

public class _49_세로_읽기 {
    public String solution(String my_string, int m, int c) {
        int my_string_len = my_string.length();
        char[] charArray = new char[my_string_len / m + (my_string_len % m > c ? 1 : 0)];
        for (int i=0; i<charArray.length; i++) {
            charArray[i] = my_string.charAt(m * i + c-1);
        }
        return new String(charArray);
    }
}
