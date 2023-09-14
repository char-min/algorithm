package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
테스트 1 〉	통과 (2.42ms, 76MB)
테스트 2 〉	통과 (2.02ms, 78.6MB)
테스트 3 〉	통과 (2.14ms, 73.5MB)
테스트 4 〉	통과 (1.89ms, 78.5MB)
테스트 5 〉	통과 (2.03ms, 74.9MB)
테스트 6 〉	통과 (1.99ms, 78.7MB)
테스트 7 〉	통과 (1.84ms, 76.1MB)
테스트 8 〉	통과 (2.01ms, 79.2MB)
테스트 9 〉	통과 (2.23ms, 69.8MB)
테스트 10 〉	통과 (2.18ms, 84.3MB)
테스트 11 〉	통과 (1.90ms, 82.3MB)
테스트 12 〉	통과 (0.16ms, 78.2MB)
테스트 13 〉	통과 (2.14ms, 70.4MB)
테스트 14 〉	통과 (2.07ms, 71.9MB)
테스트 15 〉	통과 (0.25ms, 75.3MB)
테스트 16 〉	통과 (0.28ms, 76.8MB)
테스트 17 〉	통과 (0.17ms, 86.4MB)
테스트 18 〉	통과 (2.02ms, 77.6MB)
테스트 19 〉	통과 (0.17ms, 72.2MB)
테스트 20 〉	통과 (0.15ms, 73.9MB)
테스트 21 〉	통과 (2.15ms, 78.2MB)
테스트 22 〉	통과 (0.23ms, 68.8MB)
 */
public class _32_배열_만들기_2_answer2_good {
    public static void main(String[] args) {
        int l = 1;
        int r = 1_000_000;
        int[] answer = solution(l, r);
        System.out.println(Arrays.toString(answer));
        int idx = 0;
        int[] org = {5,50,55,500,505,550,555,5000,5005,5050,5055,5500,5505,5550,5555,50000,50005,50050,50055,50500,50505,50550,50555,55000,55005,55050,55055,55500,55505,55550,55555,500000,500005,500050,500055,500500,500505,500550,500555,505000,505005,505050,505055,505500,505505,505550,505555,550000,550005,550050,550055,550500,550505,550550,550555,555000,555005,555050,555055,555500,555505,555550,555555};
        System.out.println("org.length: " + org.length);
        System.out.println("answer.length: " + answer.length);
        for (int i=0; i<answer.length; i++) {
            if (answer[i] != org[i]) {
                idx = i;
                break;
            }
        }
        System.out.println("idx: " + idx);
    }

    public static int[] solution(int l, int r) {
        List<Integer> answerList = new ArrayList<>();
        for (int i=1; i<64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (num >= l && num <= r) {
                answerList.add(num);
            }
        }
        return answerList.isEmpty() ? new int[]{-1}
                : answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
