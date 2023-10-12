package level0;

/*
테스트 1 〉	통과 (0.01ms, 77.7MB)
테스트 2 〉	통과 (0.01ms, 75.3MB)
테스트 3 〉	통과 (0.02ms, 79.4MB)
테스트 4 〉	통과 (0.02ms, 71.8MB)
테스트 5 〉	통과 (0.02ms, 83.2MB)
테스트 6 〉	통과 (0.03ms, 74.1MB)
테스트 7 〉	통과 (0.02ms, 70.3MB)
테스트 8 〉	통과 (0.02ms, 75.8MB)
테스트 9 〉	통과 (0.03ms, 76.9MB)
테스트 10 〉	통과 (0.02ms, 75.5MB)
테스트 11 〉	통과 (0.01ms, 73MB)
테스트 12 〉	통과 (0.03ms, 73.3MB)
테스트 13 〉	통과 (0.03ms, 73.6MB)
테스트 14 〉	통과 (0.02ms, 76.6MB)
테스트 15 〉	통과 (0.02ms, 70MB)
테스트 16 〉	통과 (0.03ms, 76.3MB)
테스트 17 〉	통과 (0.02ms, 72.9MB)
테스트 18 〉	통과 (0.02ms, 76.9MB)
테스트 19 〉	통과 (0.02ms, 73MB)
테스트 20 〉	통과 (0.02ms, 73.8MB)
테스트 21 〉	통과 (0.02ms, 74.6MB)
테스트 22 〉	통과 (0.02ms, 76.8MB)
테스트 23 〉	통과 (0.02ms, 77MB)
테스트 24 〉	통과 (0.03ms, 74.8MB)
테스트 25 〉	통과 (0.02ms, 76.4MB)
 */
public class _97_배열_비교하기 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length != arr2.length) {
            answer = arr1.length - arr2.length;
        } else {
            int sum1 = getSum(arr1);
            int sum2 = getSum(arr2);
            answer = sum1 - sum2;
        }
        return answer > 0 ? 1 : answer < 0 ? -1 : 0;
    }

    private int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
