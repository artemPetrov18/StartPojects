package MyltiThread_11;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMapEx {
    /*
    *
    * ставиться блок только на бакеты и следовательно только 1 поток может доступаться к определенному бакету
    *
    * null nelz'a
    * */


    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer,String> hashMap=new ConcurrentHashMap<>();

        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"d");
        hashMap.put(4,"e");
        hashMap.put(5,"f");
        Iterator<Integer>iter=hashMap.keySet().iterator();
        Runnable rn1=()->{
            while(iter.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i= iter.next();
                System.out.println(i+":"+hashMap.get(i));

            }
        };
        Runnable rn2=()->hashMap.put(5,"D");

        Thread th1=new Thread(rn1);
        Thread th2=new Thread(rn2);
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(hashMap);
    }
}

