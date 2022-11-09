package Test_Sting_2;

public class StringTest {

    public static void main(String[] args) {


        String str="Hello";

        System.out.println();

        //concat
        System.out.println("\nconcat");

        System.out.println(str.concat("AY"));
        System.out.println(str+"AY");

        //substring вибор по индексу
        System.out.println("\nsubstring вибор по индексу");

        System.out.println(str.substring(0,1));

        //valueof peredel v string
        System.out.println("\nvalueof peredel v string");

        System.out.println(str.valueOf(5));

        //replace
        System.out.println("\nreplace");

        System.out.println(str.replace("h","b"));

        //replaceAll
        System.out.println("\nreplaceAll");

        System.out.println(str.replaceAll("Hel","pek"));

       // charAt
        System.out.println("\ncharAt");

        System.out.println(str.charAt(2));

        //equals
        System.out.println("\nequals");

        String Str1 = "Добро пожаловать на ProgLang.su";
        String Str2 = Str1;
        String Str4 = "Добро пожаловать на ProgLang.su";
        String Str3 = new String("Сайт для изучения программирования");
        boolean retVal;

        retVal = Str1.equals(Str2);
        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal );

        retVal = Str1.equals(Str3);
        System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal );

        retVal = Str1.equals(Str4); // из за Стринг пула метод определн восновно его надо переопределять
        System.out.println("Строка Str1 равна строке Str4? Ответ: " + retVal );



        //indexof

        String Str = new String("Добро пожаловать на ProgLang.su");
        String SubStr1 = new String("Prog");
        String SubStr2 = new String("Srog");

        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf('о'));
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf('о', 5));
        System.out.print("Найденный индекс: ");
        System.out.println( Str.indexOf(SubStr1));
        System.out.print("Найденный индекс: ");
        System.out.println( Str.indexOf(SubStr1, 21));
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr2));

        // remova symblo
        System.out.println("\nremove symbol");
        int n =2;
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
        System.out.println(front+back);


        //repeat
        System.out.println("\nrepeat");
        int na=3;
        System.out.println(str.repeat(na));

        //peredelatb v charr array
        str.toCharArray();
           }




    public static void print(){
        System.out.println("hello");
    }
}
