package MyltiThread_11;

public class VolatileEx  extends Thread{

    /*
    * в потоке мейн когда мы меняем переменую в потоке VolatileEx это записываеться в кеш память а потом передаеться в мейн мемори
    * а когда мы пишем волидате мы потоку даем возможномть работать не с кеш мемори а напрямую с майн мемори
    *
    *
    * */

volatile  boolean b=true;    //для того что бы изменять поток во время роботы
    @Override
    public void run() {
        long counter=0;
        while (b) {
            counter++;
        }
        System.out.println("counter is "+counter);
    }


    public static void main(String[] args) throws InterruptedException {
        VolatileEx vl=new VolatileEx();
        vl.start();
        Thread.sleep(3000);
        vl.b=false;             //change thread
        vl.join();
        System.out.println("finish");

    }
}
