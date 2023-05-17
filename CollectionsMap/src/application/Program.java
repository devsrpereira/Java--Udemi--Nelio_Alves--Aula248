package application;

import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookiesMAP = new TreeMap<>();

        cookiesMAP.put("username", "Maria");
        cookiesMAP.put("email", "maria@gmail.com");
        cookiesMAP.put("phone", "119975482");

        System.out.println();
        System.out.println("Colection / Conjunto cookiesMAP original:");
        for (String key : cookiesMAP.keySet()) {
            System.out.println(key + ": " + cookiesMAP.get(key));
        }

        System.out.println();
        System.out.println("-------- cookiesMAP.remove(email)");
        cookiesMAP.remove("email");
        for (String key : cookiesMAP.keySet()) {
            System.out.println(key + ": " + cookiesMAP.get(key));
        }
        cookiesMAP.put("email", "maria@gmail.com");


        System.out.println();
        System.out.println("-------- cookiesMAP.put(email, maria@uol.com)");
        cookiesMAP.put("email", "maria@uol.com");
        for (String key : cookiesMAP.keySet()) {
            System.out.println(key + ": " + cookiesMAP.get(key));
        }
        cookiesMAP.put("email", "maria@gmail.com");

        System.out.println();
        System.out.println("-------- cookiesMAP.containsKey(email)");
        System.out.println(cookiesMAP.containsKey("email"));

        System.out.println();
        System.out.println("-------- cookiesMAP.get(email)");
        System.out.println(cookiesMAP.get("email"));

        System.out.println();
        System.out.println("-------- cookiesMAP.containsKey(ausente)");
        System.out.println(cookiesMAP.containsKey("ausente"));

        System.out.println();
        System.out.println("-------- cookiesMAP.size()");
        System.out.println(cookiesMAP.size());

        System.out.println();
        System.out.println("********* MAP HASHMAP ********");
        Map<Product, Double> productMap = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        productMap.put(p1, 10000.0);
        productMap.put(p2, 20000.0);
        productMap.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + productMap.containsKey(ps));






    }
}
