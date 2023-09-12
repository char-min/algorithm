package level0;

public class _27_수_조작하기_1 {
    public static void main(String[] args) {
        int n = 0;
//        String control = "wsdawsdassw";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<1000_000; i++) {
            sb.append('w');
        }
        String control = sb.toString();
        StopWatch.start();
        int answer = solution(n, control);
        StopWatch.end(); //4
        System.out.println(answer);
    }

    public static int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            switch (c) {
                case ('w'):
                    n++;
                    break;
                case ('s'):
                    n--;
                    break;
                case ('d'):
                    n += 10;
                    break;
                case ('a'):
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}
