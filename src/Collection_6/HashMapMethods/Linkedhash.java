package Collection_6.HashMapMethods;

import java.util.LinkedHashMap;

public class Linkedhash {
    public static void main(String[] args) {
        /*
      Записывает в последовальности добавление

      потом меняет последовательность при визова к buccket



         */

        LinkedHashMap<String,String> l1= new LinkedHashMap<>();

        l1.put("h","h");
        l1.put("a","a");
        l1.put("b","b1");
        l1.put("c","c");

        System.out.println(l1);

        l1.get("a");
        System.out.println(l1);

    }
}
