package Mullti_Threading;

public class NumberPrinter implements Runnable{
    private final int  numbertoprint;

    NumberPrinter(int numbertoprint){
        this.numbertoprint=numbertoprint;
    }
    @Override
    public void run(){
        System.out.println(numbertoprint+" "+Thread.currentThread().getName());
    }

}
