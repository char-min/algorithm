package level0;

public class _86_x_사이의_개수 {
    public int[] solution(String myString) {
        String[] splitted = myString.split("x", -1);
        int[] answer = new int[splitted.length];
        for (int i=0; i<splitted.length; i++) {
            answer[i] = splitted[i].length();
        }
        return answer;
    }
}
