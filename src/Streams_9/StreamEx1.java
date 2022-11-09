package Streams_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {

    // поток даных вызываемой колекции
    //stream ne menyat pervono4aqlnii array
    //collect(Collectors.toList()); to array
    //
    /*
    * Можно не вызывать stream kak funk
    *
    * Stream<Integer> nas=STream.of(1,3,424,4,5);
    *
    *
    * map
    * Преобразует каждый элемент стрима
    *  type*.stream().map((s) -> s + "_1").collect(Collectors.toList())
    *collect(Collectors.toList() превращает в лист
    *filter
    * Отфильтровывает записи, возвращает только записи, соответствующие условию
    *(Arrays.stream(array).
            filter(e->e>6&&e<9).toArray()

     *forEach
     * Применяет функцию к каждому объекту стрима, порядок при параллельном выполнении не гарантируется
     *
     *
     * reduce
     * //optional как обертка get розпаковка
     * //accum єто првый лемент а потом это то что получилось после итерации elem это следущий елемент
     * Arrays.stream(array).reduce((accum,elem)->accum+elem).getAsInt()
     *
     * sorted
     *
     * array = Arrays.stream(array).sorted().toArray();
     *
     *   List<String> arr=new ArrayList<>();
     * collection.stream().sorted().collect(Collectors.toList())
     *
     *
     *
     * chain
     * тоесть можно применять многораз
     *
     * sorted.reduce(..).colect..
     *
     * concat
     * обеденение
     * Stream.concat(a,b);
     *
     *distinct
     * Возвращает стрим без дубликатов (для метода equals)
     * collection.stream().distinct().collect(Collectors.toList())
     *
     * peek
     *Возвращает тот же стрим, но применяет функцию к каждому элементу стрима
     * collection.stream().map(String::toUpperCase).peek((e) -> System.out.print("," + e)).
collect(Collectors.toList())
*
*
* count
* количество елементов
*
*
*
* Метод boxed перебражает с страма интового в обычный
*
*
* parallelStream()- в основном используеться для бальших листов или min max
*
* skip
* Позволяет пропустить N первых элементов
* collection.stream().skip(collection.size() — 1).findFirst().orElse(«1»)
*
* limit
* Позволяет ограничить выборку определенным количеством первых элементов
* collection.stream().limit(2).collect(Collectors.toList())
    * */


    public static void main(String[] args) {

        List<String> arr=new ArrayList<>();

        arr.add("Ivan");
        arr.add("Evgen");
        arr.add("Sizami4");
        arr.add("Polka");
        arr.add("Yi");

//        for (int i = 0; i < arr.size(); i++) {
//            arr.set(i,String.valueOf(arr.get(i).length()));
//
//        }

         arr.stream() ;// stream переобразовали в поток
                                                                        //map

        arr.stream().map(element->element.length());//map обращаеться к каждому елементу, после єтих операций мі не можем пресвоеть єто
    // !!  arr =   arr.stream().map(element->element.length()); potomty4to eto potok
        // collect(Collectors.toList() превращает в лист
       List<Integer> arr1=arr.stream().map(element->element.length()).collect(Collectors.toList());
        System.out.println(arr);

        System.out.println(arr1);
        int[] array={3,5,2,5,6,7,43,43,53,23,5,5,9,7,9,3};
        Arrays.stream(array).map(elemet-> elemet+=3).toArray();
        System.out.println(Arrays.toString(array));

       ////////////       filter


    System.out.println(Arrays.toString(Arrays.stream(array).
            filter(e->e>6&&e<9).toArray()));              //filter


        //////////////////       forEach




      //  Arrays.stream(array).forEach(el-> System.out.println(el));//forEach без toArray
     //   Arrays.stream(array).forEach(System.out::println);



        ///////    reduce


        int result=Arrays.stream(array).reduce((accum,elem)->accum+elem).getAsInt();         //optional как обертка get розпаковка
                                                                                            //accum єто првый лемент а потом это то что получилось после итерации elem это следущий елемент
        System.out.println(result);


        ///////////       sorted

       array = Arrays.stream(array).sorted().toArray();
       arr= arr.stream().sorted().collect(Collectors.toList());
        System.out.println(arr);



    }
}
