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
            System.out.println(this.name + " has run " + dRun + " m");;
        } else {
            System.out.println(this.name + " can't run such a distance");;
        }
    }

    public void swim(float dSwim){
        System.out.println(this.species + " can't swim, do they?");
    }

    public void jump(float h){
        if(h <= this.h){
            System.out.println(this.name + " has jumped at " + " m");;
        } else {
            System.out.println(this.name + " can't jump that high");
        }
    }
}