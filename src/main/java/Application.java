import interfaces.Bike;
import interfaces.Car;
import string.StringManager;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 1. Interfejs, a klasa abstrakcyjna - różnice, przykłady

        // Moveable car = new Moveable();
        Car car = new Car();
        Bike bike = new Bike();
        int speed = bike.speedUp();
        System.out.println("Current speed is: " + speed);
        //Moveable car2 = new Car();

        // 2. Kolekcje, kontrakt hashcode-equals,
        // Polimorfizm, czemu lepiej tak:
        List<String> list1 = new ArrayList<>();
        // niz tak:
        ArrayList<String> list2 = new ArrayList<>();

        //list1 = new LinkedList<>();
        //list2 = new LinkedList<>();

        //3. String - niemutowalnosc, tworzenie nowych stringow, StringPool
        // String vs. StringBuilder vs StringBuffer
        //StringManager.createStrings();
        //StringManager.createBigString();
        StringManager.checkEqualsAndHashcodeContract();

        //4. JVM, generacje, Garbage Collector,

        // 5. Wzorce projektowe

        // 6. Czysty kod, TDD, refaktoryzacja -> jakies zadanko algorytmiczne

        // 7. Strumienie

        // 8. Git, commit, branch, po co wgl?

    }
}
