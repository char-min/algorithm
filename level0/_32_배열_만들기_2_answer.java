package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
테스트 1 〉	통과 (12.19ms, 74.3MB)
테스트 2 〉	통과 (12.52ms, 76.1MB)
테스트 3 〉	통과 (20.11ms, 74.4MB)
테스트 4 〉	통과 (22.52ms, 81.5MB)
테스트 5 〉	통과 (18.64ms, 79.2MB)
테스트 6 〉	통과 (16.06ms, 78MB)
테스트 7 〉	통과 (38.35ms, 90.3MB)
테스트 8 〉	통과 (53.61ms, 90MB)
테스트 9 〉	통과 (34.39ms, 87.9MB)
테스트 10 〉	통과 (101.86ms, 112MB)
테스트 11 〉	통과 (39.51ms, 93.1MB)
테스트 12 〉	통과 (8.10ms, 78.7MB)
테스트 13 〉	통과 (9.24ms, 80.5MB)
테스트 14 〉	통과 (15.56ms, 83.3MB)
테스트 15 〉	통과 (11.92ms, 76.9MB)
테스트 16 〉	통과 (8.85ms, 74.9MB)
테스트 17 〉	통과 (10.27ms, 75.5MB)
테스트 18 〉	통과 (35.75ms, 85.9MB)
테스트 19 〉	통과 (20.18ms, 79.4MB)
테스트 20 〉	통과 (32.67ms, 86.5MB)
테스트 21 〉	통과 (95.05ms, 93.1MB)
테스트 22 〉	통과 (24.21ms, 79.9MB)
 */
public class _32_배열_만들기_2_answer {
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
        List<Integer> list = new ArrayList<>();
        for(int i = l; i<=r; i++) {
            String str = i + "";
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 48 || str.charAt(j) == 53) {
                    count ++;
                }
            }
            if(count == str.length()) {
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        int[] empty = {-1};
        if(answer.length == 0) return empty;
        return answer;
    }
}
