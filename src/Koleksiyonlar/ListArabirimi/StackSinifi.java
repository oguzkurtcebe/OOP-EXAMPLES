package Koleksiyonlar.ListArabirimi;

import java.util.Enumeration;
import java.util.Stack;

public class StackSinifi {

    public static void main(String[] args) {
        Stack<Integer> stackListesi = new Stack<>();

        stackListesi.push(1);
        stackListesi.push(2);
        stackListesi.push(3);
        stackListesi.push(4);
        stackListesi.push(5);

        System.out.println(stackListesi);
        System.out.println(stackListesi.pop());
        System.out.println(stackListesi);
          System.out.println(stackListesi.pop());
        System.out.println(stackListesi.peek());

        Enumeration enumeration=stackListesi.elements();
        while(enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+" ");
        }
        
}
}