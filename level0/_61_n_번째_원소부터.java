package level0;

/*
테스트 1 〉	통과 (0.01ms, 72.3MB)
테스트 2 〉	통과 (0.02ms, 76.4MB)
테스트 3 〉	통과 (0.02ms, 76.4MB)
테스트 4 〉	통과 (0.01ms, 71.9MB)
테스트 5 〉	통과 (0.02ms, 77.7MB)
테스트 6 〉	통과 (0.02ms, 78.5MB)
테스트 7 〉	통과 (0.03ms, 79.9MB)
테스트 8 〉	통과 (0.02ms, 72.1MB)
테스트 9 〉	통과 (0.01ms, 75.3MB)
테스트 10 〉	통과 (0.02ms, 75.9MB)
테스트 11 〉	통과 (0.03ms, 75.6MB)
테스트 12 〉	통과 (0.02ms, 76.4MB)
테스트 13 〉	통과 (0.01ms, 75.5MB)
테스트 14 〉	통과 (0.02ms, 73.5MB)
테스트 15 〉	통과 (0.02ms, 74.7MB)
테스트 16 〉	통과 (0.03ms, 72.4MB)
테스트 17 〉	통과 (0.01ms, 74.2MB)
테스트 18 〉	통과 (0.03ms, 79MB)
테스트 19 〉	통과 (0.02ms, 77.3MB)
테스트 20 〉	통과 (0.02ms, 94MB)
 */
public class _61_n_번째_원소부터 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        for (int i=n-1, j=0; i<num_list.length; i++) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}
