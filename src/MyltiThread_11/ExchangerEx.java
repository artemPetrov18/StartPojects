package MyltiThread_11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    /*
    * Exchanger - вся суть Exchara в том что он будет заблокирован пока какойто другой поток не вызвет эго
    *
    * T1->Exchanger.exchange(data)->         main storage     <-Exchanger.exchange(data)<-T1
     *                             Когда два exchanga сработали тогда продолжаеться идти код
     *
     *
     * Метод exchange(act) передает информацию и принемает ее тоже
    * */

    public static void main(String[] args) {
        Exchanger<Actions> act=new Exchanger<>();
        List<Actions> list1=new ArrayList<>();
        list1.add(Actions.KAMENB);
        list1.add(Actions.BYMAGA);
        list1.add(Actions.BYMAGA);
        List<Actions> list2=new ArrayList<>();
        list2.add(Actions.NOJNITZU);
        list2.add(Actions.NOJNITZU);
        list2.add(Actions.KAMENB);

       new Person1("vanya",act,list1);
       new Person1("Inga",act,list2);
    }
}
enum Actions{
    KAMENB, NOJNITZU, BYMAGA;
}


class Person1 extends Thread{
    private String name;
   private Exchanger<Actions> exchanger;
    List<Actions>mylist;

    public Person1(String name, Exchanger<Actions> exchanger, List<Actions> list) {
        this.name = name;
        this.exchanger = exchanger;
        this.mylist = list;
        this.start();
    }

    private void winnerIs(Actions myAct,Actions urAct){
        if(myAct==Actions.KAMENB&&urAct==Actions.NOJNITZU
        ||myAct==Actions.BYMAGA&&urAct==Actions.KAMENB
        ||myAct==Actions.NOJNITZU&&urAct==Actions.BYMAGA)
            System.out.println(name+"Y are winner");
    }

    @Override
    public void run() {
        Actions reply;
        for (Actions act:mylist) {
            try {
                reply=exchanger.exchange(act);
                winnerIs(act,reply);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }




    }
}


