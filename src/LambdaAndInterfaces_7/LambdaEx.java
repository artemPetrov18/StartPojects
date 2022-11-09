package LambdaAndInterfaces_7;


/*
*
* Используеться что бы избежать создание нового класа в котором будет один oveveride interdacа
* такие интерфейсіы называються функциональними интерфейсами
*
*
* */
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }
}





class Comp{

        public void checkQuol(Student b,Student c,CompInter a){

            if(a.comare(b, c)){
                System.out.println(b.getName());
            }
            else System.out.println(c.getName());
        }


    }
interface CompInter{
boolean comare(Student b,Student c);

}

class Zipo implements CompInter{

    @Override
    public boolean comare(Student b, Student c) {
        if(b.getName().length()>c.getName().length())return true;
        else return false;
    }
}




public class LambdaEx {
    public static void main(String[] args) {
        Student st1=new Student("artem",10);
        Student st2=new Student("Ivane",10);

        Comp cp=new Comp();

        //lamda 4asto
        cp.checkQuol(st1,st2,(Student b,Student c)->{                // mojno zapisatb tak (b,c)-> false
            if(b.getName().length()>c.getName().length())return true;
            else return false;
        });
        //Anonymnii class redko
        cp.checkQuol(st1, st2, new CompInter() {
                    @Override
                    public boolean comare(Student b, Student c) {

                        if(b.getName().length()>c.getName().length())return true;
                        else return false;
                    }
                }
        );

        //Class very redkko
        cp.checkQuol(st1,st2,new Zipo());


//        ArrayList<Student> stds=new ArrayList<>();
//        stds.add(st1);
//        stds.add(st2);
//        Collections.sort(stds,(b,c)->{if(b.getName().length()>c.getName().length())return true;
//        else return false;});
    }
}