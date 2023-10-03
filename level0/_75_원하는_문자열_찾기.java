package level0;

public class _75_원하는_문자열_찾기 {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        return myString.contains(pat) ? 1 : 0;
    }
}
