package Interface;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        I_love_You iLoveYou=new I_love_You();

      Runnable r= ()->{
          System.out.println("Oye hoye");
      };
      Thread thread=new Thread(r);
        ExecutorService e=Executors.newCachedThreadPool();
        e.execute(r);
    Runnable i=()->{
        System.out.println("hello");
        };
        Be_Something beSomething=(a, b) -> {
            return a+b;
        };
        int[] arr={14,5,67,2,4,67};
        List<Integer> ls=new ArrayList<>();
        Stream<Integer> stream=ls.stream(); // one  element at time not more then one element in stram like apache kafka
        Comparator<Student> compa=(Student a,Student b)->{
                if(a.getClass_no()>b.getClass_no()){
                    return 0;
                }
                return 1;
        };

        Self_comparator<Student> iam=(Student a,Student b)->{
            if(a.getClass_no()>b.getClass_no()){
                return 0;
            }

            return 1;
        };
        stream.forEach(
                (ele)->{
                    System.out.println("");
                }
        );

        stream.map((el)->el*2).map((el)->el*4).forEach((el)->{
            System.out.println("sdfasfdsf");
        });

        class Pokemon implements Consumer{

            @Override
            public void accept(Object o) {
                System.out.println("Fire"+o);
            }
        }
        Pokemon pokemon=new Pokemon();
        for(Integer j:ls){

            pokemon.accept(5);
        }

        Be_Something cd=new PyaarToMujheBhihai();


    }
}
