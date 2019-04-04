package Animals;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.species = "Cats";
        this.dRun = 200;
        this.h = 2.00f;
    }

    public void run(int dRun) {
        if (dRun <= this.dRun) {
            System.out.println(this.name + " has run " + dRun + " m"); // пробежал
        } else {
            System.out.println(this.name + " can't run such a distance"); // не может пробежать такую дистанцию
        }
    }

    public void swim(float dSwim){
        System.out.println(this.species + " can't swim, do they?"); // кошки не плавают, не так ли?
    }

    public void jump(float h){
        if(h <= this.h){
            System.out.println(this.name + " has jumped at " + " m"); // прыгнул
        } else {
            System.out.println(this.name + " can't jump that high"); // не может прыгнуть так высоко
        }
    }
}
