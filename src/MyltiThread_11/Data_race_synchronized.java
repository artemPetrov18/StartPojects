package MyltiThread_11;

public class Data_race_synchronized implements Runnable{
   public  long counter=0;
    /*
    *   Data race - происходит когда один и больше потоков обращяються к одной переменной и изменяют ее
    * Когда поток изменяет он ставит переменую в майн мемори а соут берет ифнормацию с нее
    *        Изменение counter++; |sout(counter)
    *  Т1 3->4                      6               // выводит 6 потомучто Т2 за время которое Т1 вызывал саут дошитал до 6
    *  Т2 3->4->5->6               3 4 5 6
    *  Т3 3 -4                      4               // выполнилсся позно записал в майн 4 и потом вывел ее
    *
    *
    *
    *   synchronize
    * Ставит lock на метод и все другие  потоки жду пока выполниться метод
    *
    *
    *  от volitet отличаеться тем что можно больше потоков изменять
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */


    public static void main(String[] args) throws InterruptedException {
        Data_race_synchronized a =new Data_race_synchronized();
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        Thread t3=new Thread(a);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(a.counter);   // п+роисходи дата райс и коунтер не правельный для этого надо ставить лок на функцию
    }




    public synchronized void add(){ counter++; } //ставит лок



    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            add();
        }
    }


}
