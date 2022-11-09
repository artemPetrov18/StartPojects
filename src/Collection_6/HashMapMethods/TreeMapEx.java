package Collection_6.HashMapMethods;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        /*
        Отличия єто Красно Черное збалансированое бинарное дерево

        через добавления put оно сортирует по возростание

        надо переопределять Comparator or implement Comparator в клас

        kEY class должен быть final

        firstKey(): возвращает ключ первого элемента мапы;

        lastKey(): возвращает ключ последнего элемента;
        headMap(K end): возвращает мапу, которая содержит все элементы текущей, от начала до элемента с ключом end;
        tailMap(K start): возвращает мапу, которая содержит все элементы текущей, начиная с элемента start и до конца;
        subMap(K start, K end): возвращает мапу, которая содержит все элементы текущей,начиная с элемента start и до элемента с ключом end.
        */

        TreeMap<Double,Integer> tree=new TreeMap<>();
        tree.put(1.2,3);
        tree.put(2.2,3);
        tree.put(3.2,3);
        tree.put(4.2,3);

        tree.descendingMap();
        System.out.println(tree);
    }
}
