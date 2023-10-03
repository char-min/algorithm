package level0;

/*
테스트 1 〉	통과 (0.02ms, 71.9MB)
테스트 2 〉	통과 (0.02ms, 77MB)
테스트 3 〉	통과 (0.02ms, 75.9MB)
테스트 4 〉	통과 (0.04ms, 73.5MB)
테스트 5 〉	통과 (0.02ms, 76.8MB)
테스트 6 〉	통과 (0.02ms, 73.8MB)
테스트 7 〉	통과 (0.02ms, 74.3MB)
테스트 8 〉	통과 (0.02ms, 75.1MB)
테스트 9 〉	통과 (0.06ms, 74.1MB)
테스트 10 〉	통과 (0.03ms, 73.9MB)
테스트 11 〉	통과 (0.02ms, 73.1MB)
테스트 12 〉	통과 (0.02ms, 74.9MB)
테스트 13 〉	통과 (0.02ms, 76.7MB)
테스트 14 〉	통과 (0.01ms, 76.3MB)
테스트 15 〉	통과 (0.03ms, 74.9MB)
테스트 16 〉	통과 (0.02ms, 69.3MB)
테스트 17 〉	통과 (0.02ms, 76.2MB)
테스트 18 〉	통과 (0.03ms, 69.2MB)
테스트 19 〉	통과 (0.02ms, 73.9MB)
 */
public class _73_1로_만들기 {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i=0; i<num_list.length; i++) {
            int cnt = 0;
            while (num_list[i] != 1) {
                num_list[i] /= 2;
                cnt++;
            }
            answer += cnt;
        }
        return answer;
    }
}
