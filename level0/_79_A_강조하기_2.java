package level0;

/*
테스트 1 〉	통과 (0.02ms, 72.7MB)
테스트 2 〉	통과 (0.03ms, 74.5MB)
테스트 3 〉	통과 (0.03ms, 75.3MB)
테스트 4 〉	통과 (0.03ms, 72.3MB)
테스트 5 〉	통과 (0.02ms, 67.8MB)
 */
public class _79_A_강조하기_2 {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replace("a", "A");
        return myString;
    }
}
