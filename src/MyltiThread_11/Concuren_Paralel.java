package MyltiThread_11;

public class Concuren_Paralel implements Runnable {
    /*
     *cuncarancty -два действия которие делаються одновременно или по очередности
     * если они делаються одновременно тогда paralelism и  cuncarancty
     *   петь и кушать - cuncarancty
     *  говорить по телефону и готовить -paralelism и  cuncarancty
     * paralelism- это частный случай cuncarancty. Это выполнение двух или  больше дейсвий одновременно
     *
     *синхроное програмирование - это когда задача делаеться после выполение переведущей (петь и кушать - cuncarancty)
     * асинхронное програмирование - это когда достигаеться паралелизм и конкаренси
     *
     * */

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+ Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        Thread lol=new Thread(new Concuren_Paralel());
        Thread lol1=new Thread(new Concuren_Paralel());

        lol.start(); // пре выведении этих стро они будут выводиться асинхронно тоесть один раз первый будет
                        // не детерминированое програмирование когда прогрмист не знает какой поток будет віполняться
        lol1.start();


    }
}
