import java.util.*;

public class SuperMarket {

    public static Map<String, List<Item>> map = new HashMap<>();


    public static void main(String[] args) {
        Item item1 = new ClothingItem(1200.0, Type.PANTS);

        List<Item> clothesList = Arrays.asList(item1);

        map.put(ClothingItem.name, clothesList);
    }

}

