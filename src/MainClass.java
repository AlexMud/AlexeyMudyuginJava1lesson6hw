import Animals.Dog;
import Animals.Cat;

public class MainClass {
// перечисление действий
    public static void main(String[] args) {
        Cat cat = new Cat("Tsarapka");
        cat.run(250);
        cat.swim(5.00f);
        cat.jump(1.00f);
        Dog dog = new Dog("Skotobaza");
        dog.run(250);
        dog.swim(5.00f);
        dog.jump(1.00f);
    }
}
