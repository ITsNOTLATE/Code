package Consumer_Producer;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable{

    private Store store;

    private int producer_number;
    Lock lock=new ReentrantLock();
    Producer(Store store,int pn){
        this.producer_number=pn;
        this.store=store;
    }

    @Override
    public void run() {
        while (true){
            lock.lock();
            if (store.getNo_of_shirt()<store.getMaxShirt()){
                try{
                    store.setNo_of_shirt(store.getNo_of_shirt()+1);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            lock.unlock();
            System.out.println(store.getNo_of_shirt());
        }

    }
}
