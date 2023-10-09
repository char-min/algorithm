package level0;

public class _88_간단한_식_계산하기 {
    public int solution(String binomial) {
        String[] splitted = binomial.split(" ");
        int answer = 0;
        int a = Integer.parseInt(splitted[0]);
        int b = Integer.parseInt(splitted[2]);
        switch (splitted[1]) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            default:
                throw new IllegalArgumentException("op is one of '+', '-', '*'.");
        }
        return answer;
    }
}
