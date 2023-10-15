package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.47ms, 77.4MB)
테스트 2 〉	통과 (0.35ms, 73.9MB)
테스트 3 〉	통과 (0.49ms, 72MB)
테스트 4 〉	통과 (0.33ms, 74.7MB)
테스트 5 〉	통과 (0.38ms, 70.7MB)
테스트 6 〉	통과 (0.49ms, 66.6MB)
테스트 7 〉	통과 (2.03ms, 68MB)
테스트 8 〉	통과 (0.37ms, 65.5MB)
테스트 9 〉	통과 (0.59ms, 74.6MB)
테스트 10 〉	통과 (0.48ms, 75.2MB)
테스트 11 〉	통과 (0.42ms, 73.5MB)
테스트 12 〉	통과 (0.42ms, 78.1MB)
테스트 13 〉	통과 (0.48ms, 79.5MB)
테스트 14 〉	통과 (0.39ms, 79.4MB)
테스트 15 〉	통과 (0.36ms, 72.9MB)
테스트 16 〉	통과 (0.50ms, 75.2MB)
테스트 17 〉	통과 (0.46ms, 71.9MB)
테스트 18 〉	통과 (0.35ms, 76.2MB)
테스트 19 〉	통과 (0.46ms, 71.6MB)
 */
public class _113_정수_찾기_3 {
    public static void main(String[] args) {
        int[] num_list = {15, 98, 23, 2, 15};
//        int[] num_list = {2, 15, 15, 23, 98};
        int n = 20;
        int answer = solution(num_list, n);
        System.out.println(answer);
    }

    public static int solution(int[] num_list, int n) {
        Arrays.sort(num_list);
        int low = 0;
        int high = num_list.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (n == num_list[mid]) {
                return 1;
            } else if (n > num_list[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }
}
