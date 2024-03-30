package ThreadsPractice;

import javax.naming.InterruptedNamingException;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Hello_world_printer helloWorldPrinter=new Hello_world_printer();
        for (int i=0;i<=5;i++){
        Thread thread=new Thread(helloWorldPrinter);
        thread.start();}


    }
}
