package level0;

public class _55_가까운_1_찾기 {
    public static void main(String[] args) {
        int[] arr = new int[100000000];
        arr[arr.length-1] = 1;
        int idx = 0;
        StopWatch.start();
        int answer = solution(arr, idx);
        StopWatch.end(); //50
        System.out.println(answer);
    }

    public static int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i=idx; i<arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
