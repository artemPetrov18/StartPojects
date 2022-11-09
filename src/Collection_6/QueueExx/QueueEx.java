package Collection_6.QueueExx;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueEx {

    public static void main(String[] args) {

      /*  Queue
        //fifo
        МОНЖНО ДОБАВЛЯТЬ ТОЛЬКО В КОНЕЦ НО ВСЕ ВЗАИМОДЕЙСТВИЯ ДЕЛАЮТЬСЯ С НАЧАЛОМ


        Priority queue
        сортируеться по возрастание нужно переопределять компаротор для класов


        Deque
        LINKEDDEQUE AND ARRAYDEQUE
         мОЖНО ДОБАВЛЯТЬ В КОНЕЦ И НАЧАЛО



        ОТЛИЧИЕ ОБЫЧНЫХ МЕТОДОВ COLLECTIONS S QUEUE
        TYPE
        ADD-OFFER
        REMOVE-POLL
        GET-ELEMENT-PEEK

        ОТЛИЧИЕ В ТОМ ЧТО OFFER НЕ ВЫЗЫВАЕТ EXEPTION ЕСЛИ ОЧЕРЕДЬ ЗАКОНЧИЛАСЬ
        */

        PriorityQueue<String> prQ = new PriorityQueue<>();

        prQ.add("A");
        prQ.offer("A");
        prQ.add("B");
        prQ.offer("B");
        prQ.add("C");
        prQ.offer("C");
        System.out.println(prQ);
        prQ.element();
        prQ.peek();
        System.out.println(prQ);
        prQ.remove();
        prQ.poll();
        System.out.println(prQ);

        Deque<String> dQ = new ArrayDeque<>();
        dQ.add("G");
        dQ.addFirst("A");
        dQ.addLast("B");
        dQ.offerFirst("P");
        dQ.offerLast("S");
        System.out.println(dQ);
        dQ.element();
        dQ.peek();
        System.out.println(prQ);
        dQ.removeFirst();
        dQ.pollFirst();
        dQ.getFirst();
        System.out.println(prQ);



    }
}
