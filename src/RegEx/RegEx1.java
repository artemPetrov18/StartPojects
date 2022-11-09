package RegEx;

import java.util.Arrays;

public class RegEx1 {
    /*
    *replace - просто заменяет
    * а replaceAll заменят регулярніе выражениек
    *
    *
    *
    * */

    public static void main(String[] args) {
        String s="hello212 all323 guys4242";
        String []a=s.split("\\d+");
        System.out.println(Arrays.toString(a));

        String a1=s.replaceAll("\\d+","!");
        System.out.println(a1);
    }
}
