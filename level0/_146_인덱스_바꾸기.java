package level0;

public class _146_인덱스_바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        char[] answerCharArray = my_string.toCharArray();
        char tmp = answerCharArray[num1];
        answerCharArray[num1] = answerCharArray[num2];
        answerCharArray[num2] = tmp;
        return new String(answerCharArray);
    }
}
