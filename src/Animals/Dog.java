package Animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.species = "Dogs";
        this.dRun = 500;
        this.dSwim = 10.00f;
        this.h = 0.50f;
    }

    public void run(int dRun) {
        if (dRun <= this.dRun) {
            System.out.println(this.name + " has run " + dRun + " m");
        } else {
            System.out.println(this.name + " can't run such a distance");
        }
    }

    public void swim(float dSwim){
        if (dSwim <= this.dSwim) {
            System.out.println(this.name + " has swum " + dSwim + " m");
        } else {
            System.out.println(this.name + " can't swim such a distance");
        }
    }

    public void jump(float h){
        if(h <= this.h){
            System.out.println(this.name + " has jumped at " + " m");
        } else {
            System.out.println(this.name + " can't jump that high");
        }
    }
}