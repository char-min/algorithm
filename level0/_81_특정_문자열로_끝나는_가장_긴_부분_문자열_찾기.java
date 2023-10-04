package level0;

public class _81_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
    public String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat);
        return myString.substring(0, idx + pat.length());
    }
}
