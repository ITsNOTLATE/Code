package ThreadsPractice;

public class Hello_world_printer implements Runnable{

    public void run() {
        System.out.println( 1 +Thread.currentThread().getName());

    }
}
