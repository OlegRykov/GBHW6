package hw6.animal;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected static int score;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.score++;
    }

    public void info() {
        System.out.printf("%s, %s, %d", name, color, age);
    }

    public abstract void swim(int distance);

    public abstract void run(int distance);

    public static int getScore() {
        return score;
    }
}
