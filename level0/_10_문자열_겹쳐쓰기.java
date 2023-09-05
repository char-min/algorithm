package level0;

public class _10_문자열_겹쳐쓰기 {
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        String answer = solution(my_string, overwrite_string, s);
        System.out.println(answer);
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string, 0, s);
        sb.append(overwrite_string);
        int suffixStartIdx = s + overwrite_string.length();
        if (my_string.length() >= suffixStartIdx) {
            sb.append(my_string.substring(suffixStartIdx));
        }
        return sb.toString();
    }
}
