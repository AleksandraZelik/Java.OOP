package homework8;

public enum Size {
    Small("S", 80, 160),
    Medium("M", 90, 170),
    Large("L", 100, 180),
    ExtraLarge("XL", 110, 190);

    private String name;
    private int width;
    private int length;

    Size(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}


