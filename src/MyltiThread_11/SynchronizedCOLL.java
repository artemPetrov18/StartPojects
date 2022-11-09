package MyltiThread_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCOLL {
/*
* ne threadsafe
*  Collections.synchronizedList(new ArrayList<>())- менне производительный чем эго предшественик
* но избегает утечки памяти
*
*Пре входе потока в колекцию ставиться лок на всю колекцию
*
* */
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);

        }
        List<Integer> list2= Collections.synchronizedList(new ArrayList<>());
        Runnable run1=()->list2.addAll(list);
        Thread t1= new Thread(run1);
        Thread t2= new Thread(run1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(list2);
    }


}
