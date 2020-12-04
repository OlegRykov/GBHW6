package hw6.animal;

public class Cat extends Animal{
    protected static int score;


    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.score++;
    }

    @Override
    public void swim(int distance) {
        if (distance > 0){
            System.out.println(name + " утонул(а), т.к кошки не умеют плавать.");
        }else {
            System.out.println(name + " смотрит на воду со страхом.");
        }
    }

    @Override
    public void run(int distance) {
        if (distance > 200 || distance < 0){
            System.out.println(name + " не смог(ла) пробежать " + distance + "м.");
        }else {
            System.out.println(name + " пробежал(а) " + distance + "м.");
        }
    }

    public static int getScore() {
        return score;
    }
}
