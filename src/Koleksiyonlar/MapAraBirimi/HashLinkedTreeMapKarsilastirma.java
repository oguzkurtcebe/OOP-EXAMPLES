package Koleksiyonlar.MapAraBirimi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashLinkedTreeMapKarsilastirma {

    public static void main(String[] args) {
        Map<String, Integer> hashMapList = new HashMap<>();

        hashMapList.put("Ali", 11);
        hashMapList.put("Veli", 22);
        hashMapList.put("Deli", 33);
        hashMapList.put("Nuriye", 44);
        hashMapList.put("Duriye", 55);

        System.out.println("HashMape eklenene elemanlar");
        System.out.println(hashMapList);
        System.out.println();
        Map<String, Integer> treeMapList = new TreeMap<>(hashMapList);
        System.out.println("TreeMape ekelenen elemanlar:");
        System.out.println(treeMapList);

        Map<String, Integer> LinkedMapList = new LinkedHashMap<>();
        Map<Integer, String> LinkedMapList2 = new LinkedHashMap<>();
        LinkedMapList.put("Ali", 11);
        LinkedMapList.put("Veli", 22);
        LinkedMapList.put("Deli", 33);
        LinkedMapList.put("Nuriye", 44);
        LinkedMapList.put("Duriye", 55);
        System.out.println("******");
        LinkedMapList2.put(2, "Ali");
        System.out.println("LinkedHashMap'e eklenene elemanlar");
        System.out.println(LinkedMapList);
        System.out.println("Alinin numarası:" + LinkedMapList.get("Ali"));

    }

}
