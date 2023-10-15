package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
테스트 1 〉	통과 (3.91ms, 78MB)
테스트 2 〉	통과 (9.81ms, 74.6MB)
테스트 3 〉	통과 (4.46ms, 81.4MB)
테스트 4 〉	통과 (3.87ms, 78.6MB)
테스트 5 〉	통과 (4.93ms, 68.7MB)
테스트 6 〉	통과 (4.10ms, 71.1MB)
테스트 7 〉	통과 (6.38ms, 71.9MB)
테스트 8 〉	통과 (7.71ms, 81.5MB)
테스트 9 〉	통과 (5.39ms, 75.7MB)
테스트 10 〉	통과 (4.45ms, 70.9MB)
테스트 11 〉	통과 (5.49ms, 77.3MB)
테스트 12 〉	통과 (19.23ms, 88.3MB)
테스트 13 〉	통과 (3.99ms, 86.5MB)
 */
public class _109_배열의_원소_삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answerList = new ArrayList<>();
        List<Integer> deleteList = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        for (int i=0; i<arr.length; i++) {
            if (!deleteList.contains(arr[i])) {
                answerList.add(arr[i]);
            }
        }
        return answerList.stream().mapToInt(Integer::valueOf).toArray();
    }
}
