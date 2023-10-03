package level0;

import java.util.Arrays;

/*
테스트 1 〉	통과 (0.07ms, 72.7MB)
테스트 2 〉	통과 (0.07ms, 72.3MB)
테스트 3 〉	통과 (0.04ms, 74.6MB)
테스트 4 〉	통과 (0.19ms, 78.3MB)
테스트 5 〉	통과 (0.08ms, 82.9MB)
테스트 6 〉	통과 (0.12ms, 78.8MB)
테스트 7 〉	통과 (0.37ms, 83MB)
테스트 8 〉	통과 (0.59ms, 70.2MB)
테스트 9 〉	통과 (0.30ms, 74.6MB)
테스트 10 〉	통과 (61.33ms, 159MB)
테스트 11 〉	통과 (14.19ms, 106MB)
테스트 12 〉	통과 (0.04ms, 75.9MB)
테스트 13 〉	통과 (0.03ms, 70.7MB)
 */
public class _72_조건에_맞게_수열_변환하기_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int answer = solution(arr);
        System.out.println(answer);
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int[] preArr = Arrays.copyOf(arr, arr.length);
        while (true) {
            for (int i=0; i<arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (isEquals(preArr, arr)) {
                break;
            }
            preArr = Arrays.copyOf(arr, arr.length);
            answer++;
        }
        return answer;
    }

    public static boolean isEquals(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
}
