package LambdaAndInterfaces_7;
import java.util.ArrayList;
import java.util.function.Predicate;
public class PrediacateEx {

    // заменяет конструкцию интрфейса для ламбды
    //Имеет такой вид    boolean T test(T t)

    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("artem");
        arr.add("fedyasaa");
        arr.add("zimbavi");
        arr.add("ivan");
        arr.add("jenya");
        Predicate<String> as= elem->elem.length()<5;
        Predicate<String> as1= elem->elem=="ivan";
        arr.removeIf(as.and(as1));  // elsi true togda remove    elst' esho or negate
        //  arr.removeIf(elem->elem.length()<5);
        System.out.println(arr);
    }
}
