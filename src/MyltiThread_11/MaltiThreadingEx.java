package MyltiThread_11;

public class MaltiThreadingEx {
    // нельзя запускать 2 потока с одним именес
    // main это тоже поток
    // context switch
    /*                  переключение        переключение              переключение                        Конец
    * на одном ядре  1                 2                   3                             4
*может быть намногих просто ядра
    *1-10           1-5                                     5-8                                             1-10+
    *10-20                          10-17                                                                   10-20+
    *30-40                                                                              30-35                30-40
    * */


    public static void main(String[] args) {

        // Создание отдельного потока 1 способо
        // создать клас extends Thread с методом run()
        // и вызовом метода start создает отдельний поток
      Mythread mythr1=new Mythread();
        mythr1.suck();
        mythr1.start();                 // start создает отдельний поток потоки выводяться хаотично

       Mythread mythr2=new Mythread();
        mythr2.start();

        //2 способо.Создать обєкт класа Thread и переопределить в анонимно класе run
        Thread thr1=new Thread(){
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i+1);
                }
        }
    };
        thr1.start();



        // Создать класс implements Runnable и переопределить метод run
        Thread thr2=new Thread(new Threx());
        thr2.start();







}}


class Threx implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}


    class Mythread extends Thread{

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);

            }
        }

        public void suck(){
            System.out.println("suck");
        }
    }
