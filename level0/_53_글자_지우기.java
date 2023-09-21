package level0;

import java.util.Arrays;

public class _53_글자_지우기 {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        char[] charArray = new char[my_string.length() - indices.length];
        for (int i=0, j=0, k=0; i<my_string.length(); i++) {
            if (j < indices.length && i == indices[j]) {
                // 0 1 3 6 10 11 15 16
                j++;
                continue;
            }
            charArray[k++] = my_string.charAt(i);
        }
        return new String(charArray);
    }
}
