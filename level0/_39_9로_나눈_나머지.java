package level0;

public class _39_9로_나눈_나머지 {
    public int solution(String number) {
        int answer = 0;
        for (char c : number.toCharArray()) {
            answer += (c - '0');
            answer %= 9;
        }
        return answer;
    }
}
