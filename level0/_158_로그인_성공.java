package level0;

/*
테스트 1 〉	통과 (0.01ms, 78.4MB)
테스트 2 〉	통과 (0.02ms, 71.9MB)
테스트 3 〉	통과 (0.02ms, 74.9MB)
테스트 4 〉	통과 (0.02ms, 79.1MB)
테스트 5 〉	통과 (0.03ms, 73MB)
테스트 6 〉	통과 (0.01ms, 78.9MB)
테스트 7 〉	통과 (0.03ms, 72.6MB)
테스트 8 〉	통과 (0.02ms, 77.7MB)
 */
public class _158_로그인_성공 {
    public String solution(String[] id_pw, String[][] db) {
        for (int i=0; i<db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }
}
