public class ThreadY {
    public static void main(String[] args) {
        Runnable print100 = new PrintNum();
        Thread thread1 = new Thread(print100);
        thread1.start();
    }
}

class PrintNum implements Runnable {
    @Override /** Tell the thread how to run */
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(" ");
            System.out.print("JAVA");
        }
    }
}