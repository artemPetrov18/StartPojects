package LambdaAndInterfaces_7;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

/*
* Supplier
* T get();
* ()->new Car("mazda","soul",20)
* Интерфейс Supplier используется тогда, когда на вход не передаются значения, но необходимо вернуть результат.
 *
 * Consumer
* void accept(T t);
* Consumer интерфейс используется в случае, если необходимо передать объект на вход и произвести над ним некоторые операции не возвращая результат.
*  Самый частый случай использования этого интерфейса - это вывод на консоль.
*
*Funktional
*R apply(T t);
*Принимает значение в качестве аргумента одного типа и возвращает другое значение. Часто используется для преобразования одного значения в другое:
*
*
*
* */




public class OtherInterfaces {
    public static ArrayList<Car>createCars(Supplier<Car>supplierCar){           //supplier
        ArrayList<Car> cars=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add((supplierCar.get()));

        }
        return cars;


    }
    public static void chageCar(Car car,Consumer <Car> consumer) {       //consumer
        consumer.accept(car);
    }

    public static void main(String[] args) {

        ArrayList<Car> carsArr=createCars(()->new Car("mazda","soul",20));      //suplier
        System.out.println(carsArr);

        chageCar(carsArr.get(0),(car)->{car.name+="DS";car.price+=30;});
        System.out.println(carsArr);

        for (Car s :carsArr){
            System.out.println(s.getName());
        }
        carsArr.forEach(car -> System.out.println(car.getName()));          //consumer



        ArrayList<Integer> intArr=new ArrayList<>();
        intArr.add(7);
        intArr.add(3);
        intArr.add(5);
        intArr.add(1);
        intArr.add(52);
        intArr.add(12);
//        for(Integer s:intArr){
//            System.out.println(s);
//        }
//        intArr.forEach(ele->{
//            System.out.println(ele);});
//        System.out.println(intArr);



        Function<Car,Integer> funk= car -> car.price;
        avrgPrice(carsArr,funk);

    }


private static void avrgPrice(ArrayList<Car> cars,Function<Car,Integer>funk){
        int result=0;
        for (Car car:cars){
            result+= funk.apply(car);
        }
    System.out.println(result);

}


}

class Car{
    String name;
    String color;
    int price;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
