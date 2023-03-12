package homework9;

import java.time.LocalDateTime;

public abstract class Product {
    private final String name;
    private final LocalDateTime manufactureDate;
    private final int shelfLife;

    public Product(String name,LocalDateTime manufactureDate, int shelfLife){
        this.name=name;
        this.manufactureDate=manufactureDate;
        this.shelfLife=shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public LocalDateTime getManufactureDate() {
        return manufactureDate;
    }

    public String getName() {
        return name;
    }
}
