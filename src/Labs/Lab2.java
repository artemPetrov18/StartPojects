package Labs;

public class Lab2 {
    public static void main(String[] args) {
        int x1=3;
        int _1x=5; //не по общепринятым правилам
        int IV=6;
        int INT =3;
        //  int int =5; ---
        //task 2
        System.out.println(" 20/6 "+20/6);
        System.out.println("20%-6 "+20%-6);
        System.out.println("20%-6 "+-20%-6);
        System.out.println("-20%6 "+-20%6);
        System.out.println("-20/6"	+ -20/6);


        //task3
        /*


        	int a, b; long c, d; float x, y;
        y = a + c / x * y - b * d / (a + c);
        int +long (no data loss)
        long +long (data loss)



        byte b = -2;
        double d = 75L / b * 2.0f + 2.f * 5.5;




      	byte b = 2;
        double d = 2.0f * 75L / b – 2.f * 5.5;


        **/
        //
        //




        //task4

        int x=5,i=0,k=23214;

        x=-x;
        System.out.println("x = "+x);
        x*=2;
        System.out.println("x^2 = "+x);
        i++;
        System.out.println("i+1 = " +i);
        i+=2;
        System.out.println("i+2 = " +i);
        k= k%1000/100;
        System.out.println(k);

        //task 5
     task5();


    }
    public static void task5(){
        int k = 15, n = 10,   t = 1, x = -5,p = 101010;
        double   y = 2.5,   p1 = -5.582;

        boolean a = true, b = false;
        //	10 * -p >= -10 * p;
        System.out.println(10 * -p >= -10 * p);
        //	k % 7 == k / 5 – 1
        System.out.println((k % 7 == k / 5 - 1));
        //  t & p % 3 + 5
        System.out.println(	t & p % 3 + 5);
        //	x >= 0 || y == 2 && x % 2 != 0 ||y * y != 4
        System.out.println(x >= 0 || y == 2 && x % 2 != 0 ||y * y != 4);
        //	a || b && !a
        System.out.println(a || b && !a);
    }
}
