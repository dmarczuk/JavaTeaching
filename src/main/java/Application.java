import collections.map.Person;
import interfaces.Bike;
import interfaces.Car;
import singleton.Singleton;
import string.StringManager;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 1. Interfejs, a klasa abstrakcyjna - różnice, przykłady

        // Moveable car = new Moveable();
        //Car car = new Car(100);
        Bike bike = new Bike();
        System.out.println(bike.getName());

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
        StringManager.createStrings();
        StringManager.createBigString();
        StringManager.checkEqualsAndHashcodeContract();

        //4. JVM, generacje, Garbage Collector,

        // 5. Wzorce projektowe

        // 6. Czysty kod, TDD, refaktoryzacja

        // 7. Strumienie

        // 8. Git, commit, branch, po co wgl?
        // https://www.flynerd.pl/2018/02/github-dla-zielonych-pierwsze-repozytorium.html

        // 9. Wyjątki, unchecked i checked exceptions

        // 10. Singleton, implementacja, czy można złamać
        Singleton firstSingleton = Singleton.createSingleton();
        Singleton secondSingleton = Singleton.createSingleton();
        // 11. Dziedziczenie, (super), wielodziedziczenie

        // 12. Typy generyczne

        // 13. SOLID

        // 14. pass by value
        Car car1 =  new Car(100);
        // car1 ----->  CAR....
        System.out.println(car1.getMax_speed());
        changeReference(car1); // It won't change the reference!
        System.out.println(car1.getMax_speed());
        modifyReference(car1); // It will modify the object that the reference variable "f" refers to!
        System.out.println(car1.getMax_speed());

        String string1 = new String("testString"); // "testString"
        System.out.println(string1);
        changeReference(string1);
        System.out.println(string1);
        string1 = modifyReference(string1);
        System.out.println(string1);
    }

    private static void changeReference(Car car) {
        Car newCar = new Car(200);
        car = newCar;
    }
    private static void modifyReference(Car car) {
        car.setMax_speed(200);
    }


    private static void changeReference(String text) {
        text = "newString";
    }

    private static String modifyReference(String text) {
        return "newString";
    }
//

}




















// ZADANIE
// Stworzyć system z bazą przechowująca ludzi (imie, nazwisko, pesel, wiek oraz liste planowanych
// wizyt u lekarza, np data, miejsce i lekarz) oraz lekarzy
// chcemy miec mozliwosc wyswietlenia dla danej osoby oraz dla lekarza listy planowanych wizyt