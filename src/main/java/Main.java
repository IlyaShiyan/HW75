public class Main {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        myThread.start();
        myThread2.run();
    }
}
