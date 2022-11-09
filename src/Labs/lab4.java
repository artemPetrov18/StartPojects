package Labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lab4 {
    private char cahr;

    public static void main(String[] args) {
  //     task1();

//task2();

task3();

        }
    public static void task3(){
        Scanner sc2=new Scanner(System.in);
        System.out.println("size peramide");
        int iter=sc2.nextInt();
        for (int i = 1; i <= iter; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(j);
                if(j<i)
                    System.out.print(" ");
            }
            System.out.println();
            
        }

        for (int i = 1; i < iter; i++) {
            for (int j = 1; j < i; j++) {

                System.out.print(j);
                if(j<i)
                    System.out.print(" ");
            }
            System.out.println();

        }


        
        
    }

    public static void task2(){
        System.out.println("\nTask2");
        Scanner sc1=new Scanner(System.in);



        System.out.println("Enter amount of numbers ");
        int amountOfNum=sc1.nextInt();
        int i=0;

        System.out.println("Enter number ");
        ArrayList<Integer> listOfNum=new ArrayList<>();

        while(i!=amountOfNum){

            listOfNum.add(sc1.nextInt());
           i++;
        }
        System.out.println("All input numbers "+listOfNum);

        System.out.println("Amount of numbers "+ amountOfNum );

        int maxNum=listOfNum.get(0);
        for (Integer num: listOfNum){
            if (maxNum>num)
                maxNum=num;
        }
        System.out.println("Max vakue = "+maxNum);

        int minNum=listOfNum.get(0);
        for (Integer num: listOfNum){
            if (maxNum<num)
                maxNum=num;
        }
        int result=0;
        for (Integer num: listOfNum){
            result+=num;
        }
        System.out.println("Avr = " +result/listOfNum.size());


        

    }

  public static  void task1(){
      System.out.println("Task1");
      int a = 444344;
      int b = 4;

      String k = String.valueOf(b);
      String aStr = String.valueOf(a);

      int indexFrom = 0, count = 0;

      while(true){
          if (aStr.substring(indexFrom,aStr.length()).contains(k) && indexFrom <= aStr.length()){
              count++;
              indexFrom+=aStr.substring(indexFrom,aStr.length()).indexOf(k)+1;
          }
          else  break;
      }
      System.out.println("count ="+count);

  }



    }

