package level0;

/*
테스트 1 〉	통과 (0.04ms, 83.8MB)
테스트 2 〉	통과 (0.03ms, 75.8MB)
테스트 3 〉	통과 (0.05ms, 78.3MB)
테스트 4 〉	통과 (0.04ms, 75.3MB)
테스트 5 〉	통과 (0.03ms, 72MB)
테스트 6 〉	통과 (0.06ms, 72.5MB)
테스트 7 〉	통과 (0.15ms, 74.3MB)
테스트 8 〉	통과 (0.26ms, 81.3MB)
테스트 9 〉	통과 (0.07ms, 78MB)
테스트 10 〉	통과 (20.55ms, 120MB)
테스트 11 〉	통과 (8.12ms, 89.9MB)
테스트 12 〉	통과 (0.02ms, 67.1MB)
테스트 13 〉	통과 (0.04ms, 75.2MB)
 */
public class _72_조건에_맞게_수열_변환하기_2_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int answer = solution(arr);
        System.out.println(answer);
    }

    public static int solution(int[] arr) {
        int answer = 0;
        for (int i=0; i<arr.length; i++) {
            int cnt = 0;
            while (true) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                } else {
                    answer = Math.max(answer, cnt);
                    break;
                }
                cnt++;
            }
        }
        return answer;
    }
}
