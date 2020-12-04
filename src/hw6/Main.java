package hw6;

import hw6.animal.*;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("murzik", "grey", 3);
        Animal cat2 = new Cat("barsik", "black", 5);
        Animal dog1 = new Dog("bobik", "white", 8);
        Animal dog2 = new Dog("hotdog", "brown", 2);
        Animal dog3 = new Dog("tayson", "black", 5);

        System.out.println("Всего животных - " + Animal.score + ". Из них: " + Cat.score +
                " кота и " + Dog.score + " собаки.");

        cat1.swim(5);
        dog3.swim(10);

        cat2.run(100);
        dog1.run(300);
        dog2.run(600);
    }
}
