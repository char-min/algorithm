public class StopWatch {
    private static long startTime;
    private static long endTime;
    public static void start() {
        startTime = System.currentTimeMillis();
    }

    public static void end() {
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
