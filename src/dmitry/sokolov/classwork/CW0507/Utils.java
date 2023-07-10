package roman.lis.lection15;

class Utils {

    static void print(String message) {
        System.out.println(Thread.currentThread().getName() + "   " + message);
    }

    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
