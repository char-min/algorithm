package level0;

/*
테스트 1 〉	통과 (0.10ms, 77.5MB)
테스트 2 〉	통과 (0.10ms, 72.3MB)
테스트 3 〉	통과 (0.10ms, 71.7MB)
테스트 4 〉	통과 (0.09ms, 72.8MB)
테스트 5 〉	통과 (0.10ms, 75.1MB)
테스트 6 〉	통과 (0.18ms, 78.7MB)
테스트 7 〉	통과 (0.13ms, 70.4MB)
테스트 8 〉	통과 (0.10ms, 76.9MB)
테스트 9 〉	통과 (0.11ms, 76MB)
 */
public class _147_영어가_싫어요_2 {
    public long solution(String numbers) {
        String[] snumArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i<snumArray.length; i++) {
            numbers = numbers.replace(snumArray[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}
