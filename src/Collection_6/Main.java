package Collection_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrList=new ArrayList<>(10);
        List<Integer> linkedList=new LinkedList<>();
         compare(arrList,linkedList);

        System.out.println(arrList);

    }

    public static void compare(List<Integer> arrList,List<Integer> linkedList){



     for (int i = 0; i < arrList.size(); i++) {
            arrList.add((int) (Math.random() * (10 )));
            linkedList.add((int) (Math.random() * (10 )));
        }
        System.out.println(arrList);


    }

    public static void rand(List<Integer> arrList,List<Integer> linkedList){


    }



}
