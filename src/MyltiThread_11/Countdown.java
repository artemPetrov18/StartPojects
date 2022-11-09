// Продемонстрируем применение класса CountDownLatch

import java.util.concurrent.CountDownLatch;

public class Countdown {

    /*
     *CountDownLatch-создан для того что бы перед выполнением кода были выполнины некие функции которие определяюьть
     * командой *.countDown()
     *
     * *.await -ждет пока счтчик будет равняться 0 и выполняет код
     */

    public static void main(String args[]) {
        CountDownLatch cdl = new CountDownLatch(5);

        System.out.println("Запуск потока исполнения");

        new MyThread5(cdl);

        try {
            cdl.await();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println("Завершение потока исполнения");
    }
}

class MyThread5 implements Runnable {
    CountDownLatch latch;

    MyThread5(CountDownLatch c) {
        latch = c;
        new Thread(this).start();
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown(); // обратный отсчет
        }
    }}
