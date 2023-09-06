package level0;

public class _12_문자_리스트를_문자열로_변환하기 {
    public static void main(String[] args) {
        int len = 100000;
        String[] arr = new String[len];
        for (int i=0; i<len; i++) {
            arr[i] = "a";
        }
//        String[] arr = {"a","b","c"};
        StopWatch.start();
        String answer = solution(arr);
        System.out.println(answer); //3
        StopWatch.end();

        StopWatch.start();
        String answer2 = solution2(arr);
        System.out.println(answer2); //7
        StopWatch.end();
    }

    public static String solution2(String[] arr) {
        return String.join("", arr);
    }

    public static String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }
}
