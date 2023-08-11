package utility;
public class MyFunction {
    public static void wait(int sec) {

        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
