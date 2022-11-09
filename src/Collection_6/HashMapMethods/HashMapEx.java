package Collection_6.HashMapMethods;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        /*

        1.Создаеться масив с  значениями singlelinked list назіваемий table, na size 16

        //put
       2.put после введения реализуеться функция hashcode в которой математическими действиями преабразуться ключ

       3. Число с hashcode побитового умножаем на размер 16-1, этим мы определяем в какой индекс массива мы покладем наш елемент

       buccket- это линкед лист
       (hashcode,key,value,Node next)


        4. Если елементы подадают в один индекс то они записываються в LINKEDLIST

        //get

        1. Выполняеться метод hashcode с искомим ключем get(key)       пункт 1

        2. потом находиться индекс

        3. Идет скравнение по hashcode которий мы одержали на пункте 1 искомого елемнта

        3.1 Если свпал hashcode тогда выполняеться метод equels где сравниваються елемнты если совпадают то выдаеться

        3.2 если hashcode не совпал то контракт не выполняеться и мы идем в Node next equeals не  выполняеться

        4. если нету entry тогда возвращает null





        */




//        HashMap<Integer,String> myHashMap=new HashMap<>();
//        //put dobavitb
//        myHashMap.put(1,"a");
//        myHashMap.put(2,"b");
//        myHashMap.put(3,"c");
//        myHashMap.put(4,"d");
//        myHashMap.put(5,"e");
//        myHashMap.put(null,null);
//        myHashMap.put(1,"A");
//
//        //get po key
//        System.out.println(myHashMap.get(3));
//
//        //putIfApsent
//        myHashMap.putIfAbsent(6,"F");
//
//        //remove
//        myHashMap.remove(3);
//        myHashMap.remove(5,"d");
//      //  System.out.println(myHashMap);
//
//        //cointeinsValue i cointeinsKey bool
//        myHashMap.containsKey(2);
//        myHashMap.containsValue("A");
//
//        //keySet i value,возвращает mnojestvo обєктов key i value
//        myHashMap.values();
//        myHashMap.keySet();
//
//        if(myHashMap.containsKey(2)){
//        String a=myHashMap.get(2);
//       String b=myHashMap.get(2);
//        System.out.println(a.equals(b));}
//
//
//        myHashMap.replace(4,"d","C");
//        System.out.println(myHashMap);
//
//        System.out.println(myHashMap.entrySet());
//
//
//        System.out.println(myHashMap.get(7));
//
//        System.out.println();
//        //Vuvod

//        Map<String,String> map=new HashMap<>();
//        map.put("a","aa");
//        map.put("b","b");
//        map.put("c","c");
//
//        for(Map.Entry<String, String> item : map.entrySet()){
//
//            if(item.getKey()=="a"&&item.getValue()!=""){
//                map.put("b",item.getValue());
//
//                map.put("a","");
//
//            }
//
//        }
//        System.out.println(map);
//
//        HashMap<Integer,Integer> as=new HashMap<>(2,3);


        Map<String,String> map1=new HashMap<>();
        map1.put("a",null);
       map1.put("b","b");
       map1.put("c","c");

        if(!map1.containsValue("d")){
            System.out.println("aaaaaa");
        }
        System.out.println(map1.size());

        System.out.println(map1.values());


    }
}
