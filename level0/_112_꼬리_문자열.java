package level0;

/*
테스트 1 〉	통과 (0.03ms, 76.8MB)
테스트 2 〉	통과 (0.04ms, 71.3MB)
테스트 3 〉	통과 (0.05ms, 71.5MB)
테스트 4 〉	통과 (0.05ms, 80.5MB)
테스트 5 〉	통과 (0.05ms, 72.7MB)
테스트 6 〉	통과 (0.03ms, 72.5MB)
테스트 7 〉	통과 (0.05ms, 81.5MB)
테스트 8 〉	통과 (0.03ms, 72.8MB)
테스트 9 〉	통과 (0.04ms, 70.2MB)
테스트 10 〉	통과 (0.04ms, 72.2MB)
테스트 11 〉	통과 (0.04ms, 72.5MB)
테스트 12 〉	통과 (0.04ms, 73.6MB)
테스트 13 〉	통과 (0.04ms, 74.8MB)
테스트 14 〉	통과 (0.05ms, 73.9MB)
테스트 15 〉	통과 (0.04ms, 78.2MB)
테스트 16 〉	통과 (0.07ms, 77.2MB)
테스트 17 〉	통과 (0.06ms, 75.8MB)
테스트 18 〉	통과 (0.06ms, 77MB)
테스트 19 〉	통과 (0.04ms, 76.5MB)
 */
public class _112_꼬리_문자열 {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        for (String str : str_list) {
            if (!str.contains(ex)) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
