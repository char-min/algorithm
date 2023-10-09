package level0;

public class _89_문자열_바꿔서_찾기 {
    public int solution(String myString, String pat) {
        char[] charArr = pat.toCharArray();
        for (int i=0; i<charArr.length; i++) {
            charArr[i] = charArr[i] == 'A' ? 'B' : 'A';
        }
        String changed = new String(charArr);
        return myString.contains(changed) ? 1 : 0;
    }
}
