public class MyThread2 implements Runnable{
    private int i = 100;

    public void run(){
        for (int j = 0; j < 5; j++) {
            i/=2;
        }
        System.out.println(i);
    }
}
