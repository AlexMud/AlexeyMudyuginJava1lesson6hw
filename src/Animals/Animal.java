package Animals;

public abstract class Animal {
    protected String name;
    protected String species;
    protected int dRun;
    protected float dSwim;
    protected float h;

    public Animal(String name) {
        this.name = name;
        this.species = species;
        this.dRun = dRun;
        this.dSwim = dSwim;
        this.h = h;
    }

    public void run(int dRun) {
        System.out.println(this.name + " has run " + dRun + " m"); // пробежал
    }

    public void swim(float dSwim) {
        System.out.println(this.name + " has swum " + dSwim + " m"); // проплыл
    }

    public void jump(float h) {
        System.out.println(this.name + " has jumped at " + h + " m"); // прыгнул
    }
}
