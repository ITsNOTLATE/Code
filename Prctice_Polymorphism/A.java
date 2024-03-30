package Prctice_Polymorphism;

public class A extends B{

    static  int a=10;
    A(){

        System.out.println("hello A");
    }
   void hell(){
      System.out.println(a);
        System.out.println("non static block");
    }
    static void hell0(){
        System.out.println(a);
        System.out.println("static block");
    }
}
