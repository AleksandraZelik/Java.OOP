package homework9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FoodProduct banana=new FoodProduct("banana",LocalDate.now().atStartOfDay(),3);
        FoodProduct apple=new FoodProduct("apple",LocalDate.now().atStartOfDay(),3);
        NonFoodProduct toothbrush=new NonFoodProduct("toothbrush",LocalDate.now().atStartOfDay(),36);
        FoodProduct cheese = ProductFactory.createFoodProduct("cheese", LocalDate.now().atStartOfDay(), 24);
        NonFoodProduct soap=ProductFactory.createNonFoodProduct("soap", LocalDate.now().atStartOfDay(),10);
        NonFoodProduct shampoo=ProductFactory.createNonFoodProduct("shampoo", LocalDate.now().atStartOfDay(),24);

        System.out.println("Фабрика виготовила "+ ProductFactory.getFoodProductCount()+" продуктових товарів");
        System.out.println("Фабрика виготовила "+ ProductFactory.getNonFoodProductCount()+" непродуктових товарів");
        System.out.println("Загалом створено " + FoodProduct.getNumberFoodProduct()+ " продуктових товарів");
        System.out.println("Загалом створено " + NonFoodProduct.getNumberNonFoodProduct() +" непродуктових товарів");
    }
}