package level0;

public class _40_문자열_여러_번_뒤집기 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String answer = solution(my_string, queries);
        System.out.println(answer);
    }

    public static String solution(String my_string, int[][] queries) {
        char[] my_string_arr = my_string.toCharArray();
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            for (int i=s, j=e; i<j; i++, j--) {
                char tmp = my_string_arr[i];
                my_string_arr[i] = my_string_arr[j];
                my_string_arr[j] = tmp;
            }
        }
        return new String(my_string_arr);
    }
}
