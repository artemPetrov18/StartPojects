package Practice_4;
import  java.util.Arrays;


public class Task1 {

    public static void main(String[] args) {

        //task1
        int[] arr= new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random()*10);
        }

        int     max=arr[0],
                min=arr[0],
                avr=0;
        for (int i = 0; i < arr.length; i++) {

             if(max<arr[i])
                 max=arr[i];

             else if(min>arr[i])
                 min =arr[i];

             avr+=arr[i];

        }
        System.out.println("max="+max+"\nmin="+min+"\navr="+avr/arr.length);
       System.out.println(Arrays.toString(arr));







        //task 2
 //Arrays https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
        System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(removeElement(arr, arr[3])));





    }












    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                nums[i - offset] = nums[i];
            }
        }


        // Arrays.copyOf копирует значение из массива nums в новый массив
        // с длинной nums.length - offset
        return Arrays.copyOf(nums, nums.length - 4);
    }








}
