package level0;

/*
테스트 1 〉	통과 (0.20ms, 73MB)
테스트 2 〉	통과 (0.51ms, 79.8MB)
테스트 3 〉	통과 (0.21ms, 79.8MB)
테스트 4 〉	통과 (0.17ms, 74.5MB)
테스트 5 〉	통과 (0.04ms, 73.5MB)
테스트 6 〉	통과 (0.03ms, 79.5MB)
테스트 7 〉	통과 (0.02ms, 77.4MB)
 */
public class _160_특이한_정렬_2 {
    public int[] solution(int[] numlist, int n) {
        for (int i=0; i<numlist.length-1; i++) {
            for (int j=i+1; j<numlist.length; j++) {
                int a = Math.abs(numlist[i] - n);
                int b = Math.abs(numlist[j] - n);
                if (a > b || a == b && numlist[i] < numlist[j]) {
                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }
        return numlist;
    }
}
