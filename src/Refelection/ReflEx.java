package Refelection;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


public class ReflEx {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
       Class departClass =Class.forName("Refelection.Department");

        //Variatu sozdaniya
//        Class departClass1 = Department.class;
//        Department dep =new Department();
//        Class departClass2=dep.getClass(;


        // Определяет поле к которому пренадлежит
        //  Для полей приват getDeclaredField

        Field someFiled= departClass.getField("name");
        System.out.println("Type: "+someFiled.getType());
        System.out.println(" *********************");


        Field []fields= departClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Name : "+field.getName()+"\n Type : "+ field.getType());
        }

        System.out.println(" *********************");
        Method somemet= departClass.getDeclaredMethod("changeDepartment", String.class);// в пареметрах указываеи поля
        System.out.println("Metod " +somemet.getReturnType()+"\n parameter types"+ Arrays.toString(somemet.getParameterTypes()));

        // Еще есть с констурктором
        // Constructor ..



    }





}



