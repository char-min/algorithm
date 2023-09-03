package level0;

import java.util.Scanner;

public class _8_문자열_돌리기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(c)
                    .append("\n");
        }
        System.out.println(sb);
    }
}
