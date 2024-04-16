package Dp_Questions;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Tabulation {
class Test{
    Test(){

    }
    void name(){}
    void name1(){}
}

    public static void main(String[] args) throws ClassNotFoundException {
        Method[] s=Tabulation.class.getDeclaredMethods();
        System.out.println(s[0].hashCode());
        Method[] s3=Tabulation.class.getDeclaredMethods();
        System.out.println(s3[0].hashCode());
        Tabulation s5=new Tabulation();
        System.out.println(s5.hashCode());
        Tabulation s4=new Tabulation();
        System.out.println(s4.hashCode());
        int count =0;
Class c=Class.forName("java.util");

        System.out.println(c.getClass());

        System.out.println(count);
        Integer i=19;
    }

}
