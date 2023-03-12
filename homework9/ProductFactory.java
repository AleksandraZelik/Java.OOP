package homework9;

import java.time.LocalDateTime;

public class ProductFactory{
    private static int foodProductCount;
    private static int nonFoodProductCount;
    public static FoodProduct createFoodProduct(String name,LocalDateTime manufactureDate, int shelfLife) {
        foodProductCount++;
        return new FoodProduct(name,manufactureDate, shelfLife);
    }

    public static NonFoodProduct createNonFoodProduct(String name,LocalDateTime manufactureDate, int shelfLife) {
        nonFoodProductCount++;
        return new NonFoodProduct(name,manufactureDate, shelfLife);
    }
    public static int getFoodProductCount() {
        return foodProductCount;
    }

    public static int getNonFoodProductCount() {
        return nonFoodProductCount;
    }

}
