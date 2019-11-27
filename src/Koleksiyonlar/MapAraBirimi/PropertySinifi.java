package Koleksiyonlar.MapAraBirimi;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertySinifi {
    public static void main(String[] args) {
        Properties properties=new Properties();
        
        properties.setProperty("KullaniciAdi", "Oğuz");
        System.out.println(properties.getProperty("KullaniciAdi"));
        Map<String,Integer>hashMap=new HashMap<>();
    }
    
    
}
