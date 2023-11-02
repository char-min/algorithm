package level0;

public class _163_평행 {
    public int solution(int[][] dots) {
        boolean isParallel = isParallel(dots);
        if (!isParallel) {
            swap(dots, 1, 2);
            isParallel = isParallel(dots);
        }
        return isParallel ? 1 : 0;
    }

    private void swap(int[][] dots, int i, int j) {
        int[] tmp = dots[i];
        dots[i] = dots[j];
        dots[j] = tmp;
    }

    private boolean isParallel(int[][] dots) {
        int dx1 = dots[1][0] - dots[0][0];
        int dx2 = dots[3][0] - dots[2][0];
        int dy1 = dots[1][1] - dots[0][1];
        int dy2 = dots[3][1] - dots[2][1];
        return ((float)dx1) / dx2 == ((float)dy1) / dy2;
    }
}
