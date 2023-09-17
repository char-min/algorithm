package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _34_콜라츠_수열_만들기 {
    public static void main(String[] args) {
        int n = 10;
        int[] answer = solution(n);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int n) {
        List<Integer> resultList = new ArrayList<>();
        resultList.add(n);
        int last = n;
        while (last != 1) {
            if (last % 2 == 0) {
                resultList.add(last/2);
            } else {
                resultList.add(3*last+1);
            }
            last = resultList.get(resultList.size()-1);
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
