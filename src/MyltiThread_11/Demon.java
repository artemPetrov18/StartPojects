package MyltiThread_11;

public class Demon {

    /*
        Демон клас закнчивает свою роботу во время конца потока мейн в то время как user классы не заканчивают
    * В основном демон патоки  используються для фоновых програм или в спомогательних целях
    *

        Thread.intterupt();-
        перерывание  потока но он не полностью оставливаеться он делатеться до какогодто определеного момета
    *
           Метод isintterupt - проверяет если intterupt .
    *
    *
    * */

    public static void main(String[] args) throws InterruptedException {
        Additional ad=new Additional();
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                ad.user();
            }
        });
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                ad.demon();
            }
        });
        th2.setDaemon(true);

        th2.start();
        th1.start();

    }

}

class Additional{
    public void user(){
        for (char i = 'a'; i <= 'f'; i++)
            System.out.println(i);
    }
    public void demon(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }

    }
}
