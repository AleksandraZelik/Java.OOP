package homework7.animal;

import homework7.Moving;

public class Mammal extends Animal implements Moving {
    public Mammal(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void move() {System.out.println(name+ " can move");
    }
}
