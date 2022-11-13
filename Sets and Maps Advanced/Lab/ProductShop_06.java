package SetsAndMapsAdvanced;
import java.util.*;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Double>> shopInfoMap = new TreeMap<>();

        while (!inputLine.equals("Revision")){

            String[] inputLineParts = inputLine.split(", ");
            String shopName = inputLineParts[0];
            String productName = inputLineParts[1];
            double priceOfProduct = Double.parseDouble(inputLineParts[2]);

            if(!shopInfoMap.containsKey(shopName)){
                shopInfoMap.put(shopName, new LinkedHashMap<>());
                shopInfoMap.get(shopName).put(productName, priceOfProduct);
            }else{
                shopInfoMap.get(shopName).put(productName, priceOfProduct);
            }
            inputLine = scanner.nextLine();
        }
        for (var pair : shopInfoMap.entrySet()){
            System.out.printf("%s->%n", pair.getKey());
            for (var pairSecond : shopInfoMap.get(pair.getKey()).entrySet()){
                System.out.printf("Product: %s, Price: %.1f%n", pairSecond.getKey(), pairSecond.getValue());
            }
        }
    }
}
