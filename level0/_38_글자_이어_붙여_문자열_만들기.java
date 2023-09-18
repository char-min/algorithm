package level0;

public class _38_글자_이어_붙여_문자열_만들기 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for (int idx : index_list) {
            sb.append(my_string.charAt(idx));
        }
        return sb.toString();
    }
}
