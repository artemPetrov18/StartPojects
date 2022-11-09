package MyltiThread_11;



public class MaltiThreadingEx1 implements Runnable{

/*
        У потока есть 3 состояния
            new - после создания,
            running(ready->running)-после start,
            terminated - после join ili konza vipolneniya

* Thread.currentThread() - show currnt thread
* set/get-Name/Priority -name or priorirty
*getState -показывает состояние потока
*
* Thread.sleep(1000)- stop thread for 1000
* *.join(1000)-wait when thread will closed or wait 1000
*
*
* */
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread th1=new Thread(new MaltiThreadingEx1());
        th1.start();

        Thdd td1=new Thdd();
        System.out.println("name "+td1.getName()+" priority "+td1.getPriority()+"main thread"+Thread.currentThread());
        Thdd td2=new Thdd();
        System.out.println("name "+td2.getName()+" priority "+td2.getPriority()+"main thread"+Thread.currentThread());

        td1.start();
        td1.join(2000); // td2 будет ждать пока не выполниться td1, а вообще это будет остановлен поток main в котором не будет вызвана строка  td2.start();
        td2.start();
        td2.setName("td2");                 // тут показано что поток мей прочитал что изменено название потока прежде чем он выполнился
        td2.setPriority(Thread.MAX_PRIORITY);

    }

}

class Thdd extends Thread{

    @Override
    public void run() {
        System.out.println("thd thread "+Thread.currentThread());
    }
}
