package level0;

public class _67_5명씩 {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length-1)/5+1];
        for (int i=0, j=0; i<names.length; i+=5) {
            answer[j++] = names[i];
        }
        return answer;
    }
}
