package level0;
/*
테스트 1 〉	통과 (0.05ms, 77.5MB)
테스트 2 〉	통과 (0.04ms, 72.2MB)
테스트 3 〉	통과 (0.04ms, 74.7MB)
테스트 4 〉	통과 (0.04ms, 75MB)
테스트 5 〉	통과 (0.04ms, 77.2MB)
테스트 6 〉	통과 (0.04ms, 75.3MB)
테스트 7 〉	통과 (0.05ms, 67MB)
테스트 8 〉	통과 (0.05ms, 74.7MB)
테스트 9 〉	통과 (0.06ms, 72.7MB)
테스트 10 〉	통과 (0.05ms, 74.3MB)
테스트 11 〉	통과 (0.05ms, 74.4MB)
테스트 12 〉	통과 (0.06ms, 72.4MB)
테스트 13 〉	통과 (0.05ms, 80.4MB)
테스트 14 〉	통과 (0.05ms, 73.7MB)
 */
public class _150_369게임 {
    public static void main(String[] args) {
        int order = 3;
        int answer = solution(order);
        System.out.println(answer);
    }

    public static int solution(int order) {
        String orderStr = String.valueOf(order);
        int originLen = orderStr.length();
        orderStr = orderStr.replace("3", "")
                .replace("6", "")
                .replace("9", "");
        return originLen - orderStr.length();
    }
}
