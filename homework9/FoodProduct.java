package homework9;

import java.time.LocalDateTime;


public class FoodProduct extends Product {
    public  static int numberFoodProduct;
    public FoodProduct(String name, LocalDateTime manufactureDate, int shelfLife) {
        super(name, manufactureDate, shelfLife);
        numberFoodProduct++;
    }

    public static int getNumberFoodProduct(){
        return numberFoodProduct;
    }

}
