package ThreadsPractice;

public class Second_task implements Runnable{
    @Override
    public void run() {
        System.out.println("Second 1 "+Thread.currentThread().getName());
        System.out.println("Second 2");
    }
}
