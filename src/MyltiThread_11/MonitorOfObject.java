package MyltiThread_11;

public class MonitorOfObject {
/*
*
* Монитор
* При создании обекта все время создаеться монитор как отдельная сущность.
* И не работает пока мы не используем synchronzed, тоесть он ставит лок на обект
*
*Synchronized block - это блок синхронайзд по обекту
* в обычном синхронайзд едет this по умолчанию
*
*Конструктор нельзя синхронизировать
*
*
* */
    public static void main(String[] args) {
        mobileCalls mb=new mobileCalls();
        skypeCalls sk=new skypeCalls();
        viberCalls vb=new viberCalls();
        mb.start();
        sk.start();
        vb.start();

    }


}

class getCalls{
static final Object lock = new Object();//have to be static final

     void  mobileCall(){
         synchronized(lock){                        // synchronized block
        System.out.println("mobile call start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("mobile call finished");}
    }
    synchronized void viberCall(){
        synchronized(lock) {
            System.out.println("viber call start");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("viber call finished");
        }
    }
    synchronized void skypeCall(){
        synchronized(lock) {
            System.out.println("skype call start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype call finished");
        }
    }
}


class  mobileCalls extends Thread{
    @Override
    public void run() {
        new getCalls().mobileCall();
    }
}
class  skypeCalls extends Thread{
    @Override
    public void run() {
        new getCalls().skypeCall();
    }
}
class viberCalls extends Thread{
    @Override
    public void run() {
        new getCalls().viberCall();
    }
}
