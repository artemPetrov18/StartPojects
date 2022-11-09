package Collection_6;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {

     List<String> arr=new ArrayList<>(); // ссылаемся на List для того что бы потом можно было сделать так arr=new LinkedList<>()
// В основе лежит обчний масив при увелечении увилимчиваеться в два раза с помощью Arrayscopyof
        // Add
        arr.add("int");
        arr.add("double");
        arr.add("flota");
       arr.add("little");
       arr.add("sads");
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


        //         // в основно делаеться для удаления в средине
      //  arr=new LinkedList<>();


        //set
        arr.set(2,"long");



          // addall  вставляет в определьоное место
        List <String> arr5=new ArrayList<>();
        arr5.add("va");
        arr5.add("paaa");
        arr.addAll(arr5);
        arr.addAll(1,arr5);

        //clear
        //arr.clear();

        //removeAll удаляет все елменты которые присутствуют в arr5
        arr.removeAll(arr5);

        //retainAll ostavlyaet vse elementu arr5
        arr.retainAll(arr5);

        //sublist
      //  List<String>arrex=arr.subList(1,3);

        //toArray

    //    Object []stArr= (String[]) arr.toArray();
   //     String []stArr1= arr.toArray(new String[0]);

        //listof listcopyof -nelsya izmenyatb
       // List<String>arrex=arr.of(1,3);


       // Collections.sort(arr);


        //

       arr.equals("float");



       // Collections.binarySearch(arr,1);
        //Wildcard List <?> newArr= new ArrayList<>();
        //  List <? extends Numbers> newArr= new ArrayList<Double>();
        //  List <? super Numbers> newArr= new ArrayList<Double>();  Vushe number
        //      ?
        List<String> arre3x=arr;
        arre3x.add("as");
    }
}
