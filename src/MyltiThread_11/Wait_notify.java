package MyltiThread_11;

public class Wait_notify {

    /*
    * this.wait this.notify
    * wait ждет пока не будет исполнен notify на том же обекте восновном надо оспользовать на synchronized методах
    *
    * synchrozide(lock){
    * lock.wait }
    *
    *
    * */




    public static void main(String[] args) {
        Market market =new Market();
        Thread pr=new Thread(new Producer(market));
        Thread cs=new Thread(new Consumer(market));
        cs.start();
        pr.start();
    }
}



class Market{
    private int countOfBread=0;

    synchronized void getBread(){
        while (countOfBread<1){

            try {
                wait();                                  // wait untle we get 2
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
     //   synchronized(lock){
        countOfBread--;
        System.out.println("costunmer bought");
        System.out.println("countof bread "+countOfBread);
        System.out.println();
        notify();                                   //this notife 1

    }


    synchronized  void  putBread(){

        while (countOfBread>5){
            try {
                wait();                         // wait untile we get 1
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       //  synchronized(lock){
        countOfBread++;
        System.out.println("producer put bread");
        System.out.println("countof bread "+countOfBread);
        System.out.println();
        notify();                                       //this notife 2


    }
}


class Consumer implements Runnable{
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i =0;i<10;i++)
        market.getBread();
    }
}


class Producer implements Runnable{
    Market market;

    public Producer(Market market) {

        this.market = market;
    }

    @Override
    public void run() {
        for (int i =0;i<20;i++)
        market.putBread();
    }
}