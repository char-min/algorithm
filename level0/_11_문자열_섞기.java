package level0;

public class _11_문자열_섞기 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String answer = solution(str1, str2);
        System.out.println(answer);
    }

    public static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < str1.length() || j < str2.length()) {
            if (i < str1.length()) {
                sb.append(str1.charAt(i++));
            }
            if (j < str2.length()) {
                sb.append(str2.charAt(j++));
            }
        }
        return sb.toString();
    }
}
