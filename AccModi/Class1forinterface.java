package AccModi;
public class Class1forinterface {
    public static void main(String[] args) {
        Runtime runtime= Runtime.getRuntime();
        System.out.println(runtime.getClass());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.hashCode());
    }
}
