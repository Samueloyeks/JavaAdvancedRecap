public class ClothingItem extends Item {
    public static String name = "Clothing";
    public static Type type;
    public Double price;



    public ClothingItem(Double price,Type type){
        this.price = price;
        this.type = type;
    }

    public Type getType(){
        return type;
    }

    public Double getPrice(){
        return price;
    }
}
