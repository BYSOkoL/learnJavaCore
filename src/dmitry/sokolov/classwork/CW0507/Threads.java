package roman.lis.lection15;

public class Threads {

    private volatile int number = 5;



    private static final Object o = new Object();



    public static void main(String[] args) throws InterruptedException {




        Runnable r = () -> {
                printS();
//                printSB();
        };

        Thread one = new Thread(r);
        Thread second = new Thread(r);

        one.start();
        second.start();

    }

























    private static synchronized void printS() {
        System.out.println(Thread.currentThread().getName() + "     " + "Inside print");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "     " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {}
        }
        System.out.println(Thread.currentThread().getName() + "     " + "Print done.");
    }


    private static void printSB() {
        System.out.println(Thread.currentThread().getName() + "     " + "Inside print");
        synchronized (o) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "     " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {}
            }
        }
        System.out.println(Thread.currentThread().getName() + "     " + "Print done.");
    }




}
