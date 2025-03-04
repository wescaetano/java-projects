package application;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "weslley");
        cookies.put("email", "weslley@gmail.com");
        cookies.put("phone", "15997787865");

        cookies.remove("email");
        cookies.put("phone", "15998002233"); // O map não aceita repetições, então, quando criamos um objeto com a mesma chave ele sobrescreve o valor já existente

        System.out.println("Testes: ");
        System.out.println("Cookies contain key 'email': " + cookies.containsKey("email"));
        System.out.println("email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());
        System.out.println();
        System.out.println("ALL COOKIES: ");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
