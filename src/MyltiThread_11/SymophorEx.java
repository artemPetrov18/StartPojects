package MyltiThread_11;

import java.util.concurrent.Semaphore;

public class SymophorEx {

    /*
     * Синхронизатор симафор
     * Похож на лок только разрешает доступ
     * Ость опщий ресурс и мы даем разрешения сколько потоков могут этим ресурсом распаряжаться
     *
     *callBox.acquire(2); 2- это уоличество пермитов которое оно затратит
     *callBox.release(2);
     * */

    public static void main(String[] args) {
        Semaphore callBox=new Semaphore(3);


        new Person("aenya",callBox);
        new Person("vasya",callBox);
        new Person("olya",callBox);
        new Person("inga",callBox);
        new Person("artem",callBox);
        new Person("inga",callBox);
        new Person("jenya",callBox);


    }
}

class Person extends Thread{
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {


        try {
            System.out.println(name+" wait....");
            if ('a'==name.charAt(0))
            callBox.acquire(2);
            else
                callBox.acquire();
            System.out.println(name +" speak ");
            Thread.sleep(3000);
            System.out.println(name +" Call ends ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if ('a'==name.charAt(0)) {

                callBox.release(2);

        }
        else
            callBox.release();
    }
}