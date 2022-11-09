package Generics_5;

public class Main {

    public static void main(String[] args) {
       //Wildcard List <?> newArr= new ArrayList<>();
      //  List <? extends Numbers> newArr= new ArrayList<Double>();
        //  List <? super Numbers> newArr= new ArrayList<Double>();  Vushe number


    /*    List <String> newArr= new ArrayList<>();
        newArr.add("vanya");
        newArr.add("pETYA");
        newArr.add("jENYA   ");
          GenerixEx.showList(newArr);*/


          // task generic

       Schooler sc1= new Schooler("jenya",12);
        Schooler sc2= new Schooler("petya",15);

        Student st1= new Student("petya",20);
        Student st2= new Student("vasya",21);

        Team <Student> stTeam=new Team<>("Students1");
        Team <Schooler> scTeam=new Team<>("Sculer1");

        stTeam.addPartipicipant(st1);
        stTeam.addPartipicipant(st2);

        scTeam.addPartipicipant(sc1);
        scTeam.addPartipicipant(sc2);

        Team <Schooler> scTeam1=new Team<>("Sculer2");

        Schooler sc3= new Schooler("inga",11);
        Schooler sc4= new Schooler("olya",15);

        scTeam1.addPartipicipant(sc3);
        scTeam1.addPartipicipant(sc4);

      //  System.out.println("Winning team :"+scTeam.winnerTeam(scTeam1));

// iterator
     for (Partipicipant a: scTeam.getTeam()) {
      System.out.println(a.getName());

     }
     System.out.println(scTeam.getTeam().get(0).getName());





    }
}
