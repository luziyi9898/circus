package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
<<<<<<< HEAD:src/main/java/circus/Trainer.java
import circus.animal.Parrot;
=======
>>>>>>> origin/improved:src/main/java/Trainer.java

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
<<<<<<< HEAD
        getToSpeak(d2);
        train(new Duck());
<<<<<<< HEAD:src/main/java/circus/Trainer.java
        train(new Parrot());
        Animal a2 = new Animal();
        Bird b2 = new Bird();
=======
=======
        train(new Duck("Daisy"));
>>>>>>> upstream/master
        // train(new circus.animal.Parrot());
>>>>>>> origin/improved:src/main/java/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
<<<<<<< HEAD:src/main/java/circus/Trainer.java
        if(bird instanceof Duck) {
=======
        if (bird instanceof Duck) {
>>>>>>> origin/improved:src/main/java/Trainer.java
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
