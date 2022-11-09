package Collection_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterrator {
    public static void main(String[] args) {
        List<String> arr=new ArrayList<>();
        arr.add("int");
        arr.add("double");
        arr.add("flota");
        Iterator<String> iter=arr.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
