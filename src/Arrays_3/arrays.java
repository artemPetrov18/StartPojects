package Arrays_3;
import java.lang.System;
import  java.util.Arrays; //dlya arrays

public class arrays {

    public static void main(String[] args) {

        int []arr={1,2,3,5,6,7,2,3};
        int []arr2={11,33,22,32,31,23,53};


        //toString
        System.out.println("vivod ");
        System.out.println(Arrays.toString(arr));

        //copyof copyryet i ydalyaet elementu
        int [] arr1;
       arr1= Arrays.copyOf(arr, arr.length - 4);
        System.out.println(Arrays.toString(arr1));



        }
    }

