package Start_1;

public abstract class Lowclass {

    public void Lol1(){
        System.out.println(1);
    };
    public abstract void makeSound();

    public static class main {
        public static void main(String [] args){
     /*String str= "not idiot";
     String str2;
     str2=str.substring(0,5);
            System.out.println(str2);
            String[] arr={"a","b"};

    StringTest a=new StringTest();
    a.print();
    print2();*/

            Worker worker=new Worker("idiot");

          //  Start.Lowclass.newClass worker=new Start.Lowclass.Worker("idiot");
           // worker.occupation; нету доступа
            System.out.println(worker instanceof Lowclass); // instanceof проверяет евляеться оно сабкласом или класом


    }

        public static void print2(){
            System.out.println("hello");
        }


    }

    public static class newClass extends Lowclass implements sayHello {
        String name;

        public newClass(String name) {
            this.name = name;
        }

        protected void setName(String name) {
            this.name=name;
        }
        public void hi(){
            System.out.println("hi"+name);
        };


    public void makeSound(){
        System.out.println("fuck u");
    }


         void hello(){
            System.out.println("print");
        }

    }

    public static class S1 {
        String name;

        public void setName(String name) {
            this.name=name;
        }

    }

    public static interface sayHello {

        public void hi();
    }

    public static class TernarniiOperation {
        public static void main(String[] args) {
            int a=1,b=2;

            b=   (a==1)? 20:30;
           //elsi true  togda vupolnyaetsya 1 b=20 esli false b=30

        }
    }

    public static class Worker extends newClass implements sayHello {
        public String occupation;

        public void getOccupation( String occupation) {
            this.occupation=occupation;
        }

        public Worker(String name ) {
            super(name); // this.name nelsya elsi существует конструктор в класе по выше

        }
    }
}
