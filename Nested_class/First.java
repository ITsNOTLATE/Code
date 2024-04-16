package Nested_class;

public class First {

        class Second {
            int i = 10;
            int x = 20;
            class third{
                int y=2332;
            }
        }


    public static void main(String[] args) {
        First first = new First();
        First.Second s=first. new Second();
        First.Second.third t=s. new third();
        System.out.println(t.y);


    }
}
