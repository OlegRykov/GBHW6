package hw6.animal;

public class Dog extends Animal {
    public static int score;


    public Dog(String name, String color, int age) {
        super(name, color, age);
        this.score++;
    }

    @Override
    public void swim(int distance) {
        if (distance > 10){
            System.out.println(name + " не смог(ла) проплыть " + distance + "м." );
        }else if (distance < 0){
            System.out.println(name + " не понимает, что вы хотите...");
        }else {
            System.out.println(name + " проплыл(а) " + distance + "м.");
        }
    }

    @Override
    public void run(int distance) {
        if (distance > 500 || distance < 0){
            System.out.println(name + " не смог(ла) пробежать " + distance + "м.");
        }else {
            System.out.println(name + " пробежал(а) " + distance + "м.");
        }
    }
}
