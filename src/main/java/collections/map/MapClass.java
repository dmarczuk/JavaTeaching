package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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
        Person person = new Person("FirstName", "LastName", 20);
        firstMap.put(person.getFirstName(), person); // czy tak moze byc??
        //firstMap.put(person.getPesel, person);
        secondMap.put(person.getFirstName(), person);
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
