package level0;

import java.util.Arrays;

public class _63_왼쪽_오른쪽 {
    enum Type { l, r, none };
    public String[] solution(String[] str_list) {
        String[] answer = {};
        Type type = Type.none;
        int idx = -1;
        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) {
                idx = i;
                type = Type.l;
                break;
            }
            if (str_list[i].equals("r")) {
                idx = i;
                type = Type.r;
                break;
            }
        }
        switch (type) {
            case l:
                answer = Arrays.copyOf(str_list, idx);
                break;
            case r:
                answer = Arrays.copyOfRange(str_list, idx+1, str_list.length);
                break;
        }
        return answer;
    }
}
