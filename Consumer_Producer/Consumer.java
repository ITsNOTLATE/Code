package Consumer_Producer;

public class Consumer implements Runnable{

    private Store store;

    private int consumer_number;

    Consumer(Store store, int pn){
        this.consumer_number=pn;
        this.store=store;
    }

    @Override
    public void run() {
        while (true){
            if (store.getNo_of_shirt()>0){
                try{
                    store.setNo_of_shirt(store.getNo_of_shirt()-1);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(store.getNo_of_shirt());
        }

    }
}
