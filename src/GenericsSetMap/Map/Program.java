package GenericsSetMap.Map;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Carlos");
        cookies.put("email", "carlos@gmail.com");
        cookies.put("password", "1234");
        cookies.put("phone", "9999999999");

        cookies.remove("email");
        cookies.put("password", "123456789");

        System.out.println("Contains 'password': " + cookies.containsKey("password"));
        System.out.println("Phone numbres: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES: ");

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
