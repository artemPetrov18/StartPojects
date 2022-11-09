package MyltiThread_11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock_trylock {
    /*
    *
    * Одно и тоже что и synchronized block
    *Преимущество  synchronized block это то что его не надо unlock
    *
    * Lock также само занимает монитор обяквта
     *
    *trylock
    *  возвращает bool ели не получилось залочить
    *
    *
    *
    * */


    public static void main(String[] args) {

        Lock lock =new ReentrantLock();

        Bankomat bank=new Bankomat(lock,"sergei");
        Bankomat bank1=new Bankomat(lock,"jora");
        Bankomat bank2=new Bankomat(lock,"petya");
        Bankomat bank3=new Bankomat(lock,"sepa");

        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                bank.cash_out();
            }
        });
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                bank1.cash_out1();
            }
        });
        Thread th3=new Thread(new Runnable() {
            @Override
            public void run() {
                bank3.check_bal();
            }
        });
        Thread th4=new Thread(new Runnable() {
            @Override
            public void run() {
                bank2.check_bal1();
            }
        });
        th1.start();
        th2.start();
        th3.start();
        th4.start();

    }



}




class Bankomat{
    Lock lock;
    String name;

    public Bankomat(Lock lock, String name) {
        this.lock = lock;
        this.name = name;
    }

    public void cash_out() {

        try {
            lock.lock();
            System.out.println(name +" purchasing");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
        System.out.println(name +" purchasing finished");
    }
    public void check_bal(){


        try {
            lock.lock();
            System.out.println(name+"Cheacking balance");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
        System.out.println(name +" Cheacking finished");

    }
    public void check_bal1(){

        if(lock.tryLock()) {
            try {

                System.out.println(name + "Cheacking balance");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
            System.out.println(name + " Cheacking finished");
        }
        else
        System.out.println("dont want to wait balance");
    }

    public void cash_out1() {
        if (lock.tryLock()) {
            try {
                lock.lock();
                System.out.println(name + " purchasing");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
            System.out.println(name + " purchasing finished");
        }

    else
     System.out.println("dont want to wait balance");

}}
