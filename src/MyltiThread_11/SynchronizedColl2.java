package MyltiThread_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedColl2 {
/*
Если использовать итератор надо синхронизировать по листу
 Все это произходит из за итератора так как он может проходить по колекции а в тоже время другой поток может удалять эти елементы
 и у тератора возникнит ошибка

* */

    public static void main(String[] args) throws InterruptedException {


        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);

        }
        List<Integer> list2= Collections.synchronizedList(list);
        Runnable run1=()->{
            synchronized (list2){                   //synchronized
            Iterator<Integer> iter=list2.iterator();
            while (iter.hasNext())
                System.out.println(iter.next());}
        };
        Runnable run2=()->list2.remove(10);

        Thread t1= new Thread(run1);
        Thread t2= new Thread(run2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(list2);
    }


}
