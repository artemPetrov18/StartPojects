package MyltiThread_11;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWrite {
/*
* В основноим используеться для большых масивов и для чтения илементов нежели записи
* в случае с итераторм итератор запоминает ерейлист в начале
*
*
*
* */
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> hashMap=new CopyOnWriteArrayList<>();

        hashMap.add("a");
        hashMap.add("b");
        hashMap.add("d");
        hashMap.add("e");
        hashMap.add("f");
        Iterator<String> iter=hashMap.iterator();
        Runnable rn1=()->{
            while(iter.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(iter.next());

            }
        };
        Runnable rn2=()-> {
            hashMap.remove(2);
            hashMap.set(2,"ass");
        };

        Thread th1=new Thread(rn1);
        Thread th2=new Thread(rn2);
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(hashMap);
    }
    }

