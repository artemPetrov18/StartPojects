package Collection_6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListex {
   private Node head;
   private int size;


   public void add(int value){

       if(head==null){
           head=new Node(value);
           System.out.println(head.getValue());

       }
       else{
           Node temp=head;
           while (temp.getNext()!=null){
               temp=temp.getNext();
           }
           temp.setNext(new Node(value));
       }

size++;

   }

   public int get(int index){
       if(head==null)
           return -1;

       Node temp=head;
       int idx=0;
       while(temp!=null){
            if (idx==index){

                return temp.getValue();
            }
            idx++;
        temp=temp.getNext();

       }


return -1;
   }


   public void remove(int value){
       if (head==null){
           return;
       }
       Node temp=head;

       while (temp.getNext()!=null){
           if(temp.getNext().getValue()==value){
               temp.setNext(temp.getNext().getNext());
               size--;
            return;

           }
           temp= temp.getNext();

       }
   }

   public String toString(){

       Node temp =head;
       System.out.println();
       int[] arr=new int [size];
       int idx=0;
       while (temp!=null){

           arr[idx++]=temp.getValue();
           temp=temp.getNext();

       }

return Arrays.toString(arr);
   }


    private static class  Node {
        private Node next;
        private int value;

        public Node(int value){
            this.value=value;
        }


        public void setNext(Node next) {
            this.next = next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }
    }

}

 class LinkesListRules{
    private void rules(){
        List<String> arr=new LinkedList<>(); // ссылаемся на List для того что бы потом можно было сделать так arr=new LinkedList<>()
// В основе лежит обчний масив при увелечении увилимчиваеться в два раза
        // Add
        arr.add("int");
        arr.add("double");
        arr.add("flota");
        System.out.println( arr);

        //isEmpty
        System.out.println("\nisempty"+arr.isEmpty());

        //remove
        arr.remove("int");
        System.out.println(arr);

        // get
        System.out.println("\nget"+arr.get(0));

        //arr.size
        System.out.println(arr.size());

    }
}
