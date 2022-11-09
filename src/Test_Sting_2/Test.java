package Test_Sting_2;

import java.util.*;

public class Test {
int a;
    public static void main(String[] args) {

/*
String str="hello";

        System.out.println(str.substring(str.length()-2,str.length()).repeat(3));
        System.out.println(str.charAt(0));

        boolean s=true;

        int []arr={1,2,3};
        int []arr2={1,2,3,3};
        int n=Math.min(arr.length,arr2.length);
        System.out.println(n);

        int[][] arr5=new int[5][3];
        System.out.println();


        for (int i = 0; i < arr.length; i++) {

        }

*/



            Map<String,String> hs=new HashMap<>();

            hs.put("a","aa");

        hs.put("ba","baa");
        System.out.println(hs);
        Getp(hs);
        System.out.println(hs);
        GetS(hs);
        System.out.println(hs);


    }

public static void Getp(Map<String,String>hs){
    hs.put("SSSS","aa");
}
    public static Map GetS(Map<String,String>hs){
        hs.put("KKKK","aa");
        return hs;
    }
}
