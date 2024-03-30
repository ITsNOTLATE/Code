package Mullti_Threading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Executor executor= Executors.newCachedThreadPool();
        
       for (int i=1;i<=100;i=i+2){
           if(i==50){
               System.out.println("wait");
           }
           NumberPrinter numberPrinter=new NumberPrinter(i);
       executor.execute(numberPrinter);


    }
       H3llo<Integer> h1=new H3llo<>();
    }
}
