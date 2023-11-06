package level0;

public class _165_외계어_사전 {
    public int solution(String[] spell, String[] dic) {
        for (int i=0; i<dic.length; i++) {
            String word = dic[i];
            for (int j=0; j<spell.length; i++) {
                word.replace(spell[j], "");
            }
            if (word.length() == 0) {
                return 1;
            }
        }
        return 2;
    }
}
