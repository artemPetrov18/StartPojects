package NastedClasses_8;

public class StaticNsted {
    private String typeHouse;
    private Chair chair;
    private Concrete conc;
    private int amount= conc.amountOfConcrate;
    private static int a;
    /*
    static class - создовать без создание внешнего обекта нужно толко указать в каком класе он находиться,можно использовать в других обектах
    Может наследовать быть final
    можно обращаться к private внешнего класа только к статик
    Для токго что бы добраться до елементов в анонимном класе надо создать обек и Car.name перемной кокрой мы хотим узнать

    inner class
    this.conc= this.new Concrete(amount);
    создание внутринего класа
    только non-static удуьтег
    есть доступ к private

    StaticNsted.Concrete с1=hs1.new Concrete(5);

    local inner class
    может быть только в методе и он будет доступен только в этом методе без исключения
    * */

    public StaticNsted(String typeHouse,int amount) {
        this.typeHouse = typeHouse;
        this.conc= this.new Concrete(amount);
    }

    @Override
    public String toString() {
        return "StaticNsted{" +
                "typeHouse='" + typeHouse + '\'' +
                ", chair=" + chair +
                '}';
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }



    public static class Chair {
            int weight;

        public Chair(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Chair{" +
                    "weight=" + weight +
                    '}';
        }
    }

    public class Concrete{
        int amountOfConcrate;

        public Concrete(int amountOfConcrate) {
            this.amountOfConcrate = amountOfConcrate;
        }

        @Override
        public String toString() {
            typeHouse="5";
            return "Concrete{" +
                    "amountOfConcrate=" + amountOfConcrate +
                    '}';
        }
    }


}

class Test{

    public static void main(String[] args) {
        StaticNsted.Chair ch1=new StaticNsted.Chair(20);

        StaticNsted  hs1=new StaticNsted("hs1",5);
        StaticNsted.Concrete с1=hs1.new Concrete(5);

        StaticNsted  hs5=new StaticNsted("hs1",5){//Анонимный клас ткакойже как local inner с помощью аннонимного класса можно оверайддить методы
            public int a;
            public void print(){
                System.out.println(1);
            }


        };

    }
}
