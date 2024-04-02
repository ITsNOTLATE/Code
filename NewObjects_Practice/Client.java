package NewObjects_Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) {
        Queue<AtomicInteger> queue = new LinkedList<>();
        AtomicInteger a;
        ConcurrentHashMap<Integer, Integer> mp;
        Semaphore semaphore = new Semaphore(4);
        Semaphore semaphore1 = new Semaphore(0);

    }


}
