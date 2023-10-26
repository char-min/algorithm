package level0;

/*
테스트 1 〉	통과 (0.10ms, 75.5MB)
테스트 2 〉	통과 (0.13ms, 75.5MB)
테스트 3 〉	통과 (0.17ms, 74.8MB)
테스트 4 〉	통과 (0.12ms, 83.9MB)
테스트 5 〉	통과 (0.09ms, 76.6MB)
테스트 6 〉	통과 (0.15ms, 74MB)
테스트 7 〉	통과 (0.10ms, 72.6MB)
테스트 8 〉	통과 (0.14ms, 80.3MB)
테스트 9 〉	통과 (0.14ms, 77.7MB)
 */
public class _147_영어가_싫어요 {
    public long solution(String numbers) {
        String rNum = numbers.replace("zero", "0")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");
        return Long.parseLong(rNum);
    }
}
