package homework9;

import java.time.LocalDateTime;

public class NonFoodProduct extends Product {
    private static int numberNonFoodProduct;

    public NonFoodProduct(String name, LocalDateTime manufactureDate, int shelfLife) {
        super(name, manufactureDate, shelfLife);
        numberNonFoodProduct++;
    }
    public static int getNumberNonFoodProduct(){
        return numberNonFoodProduct;
    }
}

