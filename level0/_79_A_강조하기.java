package level0;

/*
테스트 1 〉	통과 (0.06ms, 73.3MB)
테스트 2 〉	통과 (0.10ms, 76.3MB)
테스트 3 〉	통과 (0.04ms, 76.3MB)
테스트 4 〉	통과 (0.04ms, 74.5MB)
테스트 5 〉	통과 (0.05ms, 84.8MB)
 */
public class _79_A_강조하기 {
    public String solution(String myString) {
        char[] myStringArr = myString.toCharArray();
        for (int i=0; i<myString.length(); i++) {
            if (myStringArr[i] == 'a') {
                myStringArr[i] = 'A';
            } else if (myStringArr[i] != 'A'
                    && Character.isUpperCase(myStringArr[i])) {
                myStringArr[i] = Character.toLowerCase(myStringArr[i]);
            }
        }
        return new String(myStringArr);
    }
}
