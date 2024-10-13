package collections.map;

import java.util.*;

public class MapClass {


    private Map<String, Person> firstMap;
    private Map<String, Person> secondMap;
    private Person person;


    public MapClass(){
        firstMap = new LinkedHashMap<>();
        secondMap = new TreeMap<>();
        person = new Person("FirstName", "LastName", 20);
        // a -> b -> c -> d
    }

    public void addElementToMap(String name) {
        Person person = new Person("Adam", "LastName", 20);
        firstMap.put(person.getFirstName(), person); // czy tak moze byc??
        Person person2 = new Person("Adam", "bbb", 21);
        firstMap.put(person.getFirstName(), person2);
        // "ania"  (ania, Kowalska, 16)
        // "piotek"
        // ""
        // "adam" -> Lista:  person (adam, LastName, 20), Person("Adam", "bbb", 21);
        //firstMap.put(person.getPesel, person);
        secondMap.put(person.getFirstName(), person);
    }

    private void findElement() {
        List<Person> list = new LinkedList<>();
        Person person = new Person("Adam", "LastName", 20);
        Person person2 = new Person("Adam", "bbb", 21);
        list.add(person);
        list.add(person2);

        Person person3 = new Person("Adam", "LastName", 20);
        for (int i = 0; i < list.size(); i++) {
            person = list.get(i);
            if (person.equals(person3) == true) {

            }
        }


    }

    public void findElementFromMap(String name) {
        boolean isElemInHashSet = firstMap.containsValue(person);
        boolean isElemInTreeSet = secondMap.containsValue(person);
    }

    public void deleteElementFromMap(String name) {
        firstMap.remove(name);
        secondMap.remove(name);
    }



    // hashmapa przechowuje elementy w postaci klucz-wartosc, pozwala pobierac i dodawac zazwyczaj w czasie stalym
    // w hashmapie mapa wywoluje hashcode dla danego klucza i element laduje do odpowiedniego kubelka
    // w linkedhashmapie -> mamy "kubelki"
    // jesli w kubelku znajduje sie juz jakis element to dla kluczy wywolywana jest metoda equals
    // jesli klucz sa takie same to element jest zastepowany nowym
    // jesli sa rozne do element jest dodawny do listy (od javy 8 drzewo binarne) ktora znajduje sie w danym kubelku

    // Pytanie co moze byc kluczem w mapie?
    // obiekt niezmienny (immutable) -> co to znaczy?
    // najczesciej String lub Integer



}
