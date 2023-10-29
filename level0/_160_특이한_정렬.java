package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
테스트 1 〉	통과 (0.50ms, 74.3MB)
테스트 2 〉	통과 (0.64ms, 77.8MB)
테스트 3 〉	통과 (0.45ms, 73.3MB)
테스트 4 〉	통과 (0.52ms, 73.3MB)
테스트 5 〉	통과 (0.39ms, 77.1MB)
테스트 6 〉	통과 (0.39ms, 74.4MB)
테스트 7 〉	통과 (0.39ms, 74.4MB)
 */
public class _160_특이한_정렬 {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        int[] answer = new int[numlist.length];
        List<Integer> distList = new ArrayList<>();
        int[] sortArr = new int[numlist.length];
        boolean[] isPicked = new boolean[numlist.length];
        for (int i=0; i<numlist.length; i++) {
            int dist = Math.abs(numlist[i] - n);
            distList.add(dist);
            sortArr[i] = dist;
        }
        Arrays.sort(sortArr);
        for (int i=0; i<answer.length; i++) {
            for (int j=distList.size()-1; j>=0; j--) {
                if (!isPicked[j] && distList.get(j) == sortArr[i]) {
                    isPicked[j] = true;
                    answer[i] = numlist[j];
                    break;
                }
            }
        }
        return answer;
    }
}
