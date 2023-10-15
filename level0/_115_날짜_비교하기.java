package level0;

/*
테스트 1 〉	통과 (0.02ms, 87.7MB)
테스트 2 〉	통과 (0.02ms, 72.3MB)
테스트 3 〉	통과 (0.02ms, 74.6MB)
테스트 4 〉	통과 (0.02ms, 68.4MB)
테스트 5 〉	통과 (0.02ms, 73.3MB)
테스트 6 〉	통과 (0.03ms, 67.5MB)
테스트 7 〉	통과 (0.02ms, 80.4MB)
테스트 8 〉	통과 (0.01ms, 73.5MB)
테스트 9 〉	통과 (0.02ms, 71.2MB)
테스트 10 〉	통과 (0.03ms, 72.2MB)
테스트 11 〉	통과 (0.03ms, 76.1MB)
테스트 12 〉	통과 (0.03ms, 77.2MB)
테스트 13 〉	통과 (0.02ms, 74.4MB)
테스트 14 〉	통과 (0.01ms, 73MB)
테스트 15 〉	통과 (0.02ms, 72.9MB)
 */
public class _115_날짜_비교하기 {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for (int i=0; i<3; i++) {
            if (date1[i] < date2[i]) {
                return 1;
            } else if (date1[i] > date2[i]) {
                return 0;
            }
        }
        return answer;
    }
}
