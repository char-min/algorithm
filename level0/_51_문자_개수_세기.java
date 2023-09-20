package level0;

public class _51_문자_개수_세기 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer[c-'A']++;
            } else {
                answer[c-'a'+26]++;
            }
        }
        return answer;
    }
}
