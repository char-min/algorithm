package level0;

public class _42_부분_문자열_이어_붙여_문자열_만들기 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<parts.length; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }
        return sb.toString();
    }
}
