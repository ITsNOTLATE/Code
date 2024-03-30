package Consumer_Producer;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store=new Store();
        Random random=new Random();
        int x=random.nextInt();
        Producer producer=new Producer(store,x);
        Consumer consumer=new Consumer(store,x);
        ExecutorService executors=Executors.newCachedThreadPool();
        executors.submit(producer);
        executors.submit(consumer);
    }
}
