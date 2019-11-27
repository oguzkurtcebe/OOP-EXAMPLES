package Koleksiyonlar.ListArabirimi;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSinifi {

    public static void main(String[] args) {
        Queue<String> kuyruk = new LinkedList<>();

        kuyruk.offer("1");
        kuyruk.offer("2");
        kuyruk.offer("3");
        kuyruk.offer("4");
        kuyruk.offer("5");
        System.out.println(kuyruk);
        kuyruk.poll();
        System.out.println(kuyruk);
        kuyruk.offer("6");
        System.out.println(kuyruk);
        kuyruk.add("7");
        System.out.println(kuyruk);
    }

}
