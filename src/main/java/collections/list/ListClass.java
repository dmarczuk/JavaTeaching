package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {

    private List<String> firstList;
    private List<String> secondList;


    public ListClass(){
        firstList = new ArrayList<>();
        secondList = new LinkedList<>();
        // a -> b -> c -> d
    }

    public void addElementToList(String name) {
        firstList.add(name);
        secondList.add(name);
    }

    public void findElementFromList(String name) {
        firstList.indexOf(name);
        secondList.indexOf(name);
    }

    public void deleteElementFromList(String name) {
        firstList.remove(name);
        secondList.remove(name);
    }










    // ArrayList - szybki dostep do elementow poprzez index (tak jak w tablicy)
    // LinkedList - szybkie dodawanie i usuwanie elementow -> wystarczy przestawic wskaznik na odpowiedni element

    //czyli arraylist uzywamy bardziej jesli bedziemy bardziej chcieli odczytywac dane niz dodawac i usuwac
}
