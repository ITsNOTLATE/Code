package polymorphism;

import java.util.Random;


public class client {
    static Parent getObject(){
        Random random=new Random();
        Child1 child1=new Child1();
        if(random.nextInt()%2==0){
            return child1;
        }
        return child1;
    }
    public static void main(String[] args) {
        Parent parent= getObject();
        parent.hello();
    }
}
