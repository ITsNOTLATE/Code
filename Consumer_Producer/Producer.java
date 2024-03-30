package Consumer_Producer;

public class Producer implements Runnable{

    private Store store;

    private int producer_number;

    Producer(Store store,int pn){
        this.producer_number=pn;
        this.store=store;
    }

    @Override
    public void run() {
        while (true){
            if (store.getNo_of_shirt()<store.getMaxShirt()){
                try{
                    store.setNo_of_shirt(store.getNo_of_shirt()+1);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(store.getNo_of_shirt());
        }

    }
}
