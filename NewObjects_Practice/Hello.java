package NewObjects_Practice;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Hello <V,T>{

    Object l;

    T m;
    NewObjects_Practice.Client x;

    NewObjects_Practice.Client y;

    Semaphore s1=new Semaphore(6);

    HashMap hashMap=new HashMap();
    public static <T> T send(T abc){

        return abc;
    }
}
