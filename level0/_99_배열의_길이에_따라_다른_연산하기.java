package level0;

public class _99_배열의_길이에_따라_다른_연산하기 {
    public int[] solution(int[] arr, int n) {
        for (int i = arr.length % 2 == 1 ? 0 : 1; i<arr.length; i+=2) {
            arr[i] += n;
        }
        return arr;
    }
}
