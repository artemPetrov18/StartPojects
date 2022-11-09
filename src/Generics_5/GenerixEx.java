package Generics_5;

import java.util.List;

public class GenerixEx <T,X extends Number>{ // в T можео подставить только значения которие есть в extends Number и имплементят итрефейси  extends Number&list&..
public T value;

// genrriki нельзя перегружать так как компилятор видит все без <>


public <T>T loop(T value){ // можно не писать <T>
    System.out.println("print");
    return value;
}

public static void showList(List<?> list){
    System.out.println("list withy any types" + list);
}


}

