package level0;

/*
테스트 1 〉	통과 (0.02ms, 73.4MB)
테스트 2 〉	통과 (0.01ms, 74.9MB)
테스트 3 〉	통과 (0.03ms, 74.1MB)
테스트 4 〉	통과 (0.02ms, 79.9MB)
테스트 5 〉	통과 (0.03ms, 76.5MB)
테스트 6 〉	통과 (0.02ms, 66.1MB)
테스트 7 〉	통과 (0.02ms, 70.1MB)
테스트 8 〉	통과 (0.03ms, 75.9MB)
테스트 9 〉	통과 (0.04ms, 81.3MB)
테스트 10 〉	통과 (0.02ms, 72.8MB)
테스트 11 〉	통과 (0.02ms, 78.4MB)
테스트 12 〉	통과 (0.02ms, 83.2MB)
테스트 13 〉	통과 (0.02ms, 74MB)
테스트 14 〉	통과 (0.01ms, 77.8MB)
테스트 15 〉	통과 (0.02ms, 75.6MB)
테스트 16 〉	통과 (0.02ms, 79.7MB)
테스트 17 〉	통과 (0.03ms, 74MB)
테스트 18 〉	통과 (0.02ms, 73.4MB)
테스트 19 〉	통과 (0.01ms, 77MB)
 */
public class _113_정수_찾기 {
    public int solution(int[] num_list, int n) {
        boolean find = false;
        for (int num : num_list) {
            if (num == n) {
                find = true;
                break;
            }
        }
        return find ? 1 : 0;
    }
}
