package Labs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
       Car[]cars=new Car[7];
        cars[0]=new Car(1,"BMW","X5",2019,"red",80000,"KA1823BM");
        cars[1]=new Car(2,"BMW","M5",2015,"black",45000,"AA32413MA");
        cars[2]=new Car(3,"Mercedes","C-63",2021,"Red",95000,"KA8333BOM");
        cars[3]=new Car(4,"AUdi","A5",2010,"Black",12000,"AA32235MXM");
        cars[4]=new Car(5,"Audi","A3",2019,"white",22000,"AA3243OT");
        cars[5]=new Car(6,"Mercedes","CLA-250",2016,"Black",15000,"AA8645OK");
        cars[6]=new Car(7,"Toyota","Camry",2013,"Yellow",8000,"AA1823BM");
        System.out.println(" searchMarka");
        searchMarka(cars);
        System.out.println("\n searchModel");
        searchModel(cars);
        System.out.println("\nExect Year");
        exectYear(cars);
        System.out.println("\nExect Color");
        exectColor(cars);
        System.out.println("\nExect Reg");
        exectRegNumber(cars);

    }

    public static void searchMarka(Car[] cars){
      //  Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter marka \n");
        //String curentMarka=scanner.nextLine();
        int counter=0;
      String curentMarka="BMW";
        for (Car car :cars) {
            if (car.getMarka() == curentMarka) {
                System.out.println(car);
            }
        }
        if(counter==0)
            System.out.println("No such car");
    }

public static void searchModel(Car[] cars){
  //  Scanner scanner = new Scanner(System.in);
   // System.out.println("Enter marka \n");
    //String curentMarka=scanner.nextLine();
  //  System.out.println("Enter explotationtYear \n");
    //int explotationtYear=scranner.nextInt();

    int explotationtYear=5;
    String curentMarka="Mercedes";
    int currentYear=2022;
    int counter=0;
    for (Car car :cars) {
        if (car.getMarka() == curentMarka&&(currentYear - car.getYear())>explotationtYear) {
            System.out.println(car);
            counter++;
        }
    }
    if(counter==0)
        System.out.println("No such car");
}

    public static void exectYear(Car[] cars){
        //  Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter yearofProd \n");
        //int yearofProd=scanner.nextInt();
        //   System.out.println("Enter price \n");
        //int priceOfCar=scanner.nextInt();
        int yearofProd=2019;
        int price=20000;

        int counter=0;
        for (Car car :cars) {
            if (car.getYear()==yearofProd && car.getPrice()>price) {
                System.out.println(car);
                counter++;
            }
        }
        if(counter==0)
            System.out.println("No such car");
    }

    public static void exectColor(Car[] cars){
        //  Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter color \n");
        //String color=scanner.nextLine();
        // System.out.println("Enter marka \n");
        //String curentMarka=scanner.nextLine();
        // System.out.println("Enter model \n");
        //String curentModel=scanner.nextLine();

        String color="red";
        String curentMarka="BMW";
        String curentModel="M5";
        int counter=0;
        for (Car car :cars) {
            if (curentMarka==car.getMarka() && car.getModel()==curentModel && color!=car.getColor()) {
                System.out.println(car);
                counter++;
            }
        }
        if(counter==0)
            System.out.println("No such car");
    }

    public static void exectRegNumber(Car[] cars){
        int a=2;




        int counter=0;

        for (Car car :cars) {


            if (car.getNumberReg().contains("AA") && car.getYear()>2018) {
                System.out.println(car);
                System.out.println("Year of production more then RegNumber");
                counter++;
            }
            else {
                System.out.println(car);
                counter++;
            }
        }
        if(counter==0)
            System.out.println("No such car");
    }

    }

 class Car {
     private int id;
     private String marka;
     private String model;
     private int year;
     private String color;
     private int price;
     private String numberReg;

     @Override
     public String toString() {
         return "Car{" +
                 "id=" + id +
                 ", marka='" + marka + '\'' +
                 ", model='" + model + '\'' +
                 ", year=" + year +
                 ", color='" + color + '\'' +
                 ", price=" + price +
                 ", numberReg='" + numberReg + '\'' +
                 '}';
     }


     public Car(int id, String marka, String model, int year, String color, int price, String numberReg) {
         this.id = id;
         this.marka = marka;
         this.model = model;
         this.year = year;
         this.color = color;
         this.price = price;
         this.numberReg = numberReg;
     }

     public int getId() {
         return id;
     }

     public String getMarka() {
         return marka;
     }

     public String getModel() {
         return model;
     }

     public int getYear() {
         return year;
     }

     public String getColor() {
         return color;
     }

     public int getPrice() {
         return price;
     }

     public String getNumberReg() {
         return numberReg;
     }
 }
