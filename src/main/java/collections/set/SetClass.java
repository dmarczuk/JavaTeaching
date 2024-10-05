package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

    private Set<String> firstSet;
    private Set<String> secondSet;


    public SetClass(){
        firstSet = new HashSet<>();
        secondSet = new TreeSet<>();
        // a -> b -> c -> d
    }

    public void addElementToSet(String name) {
        firstSet.add(name);
        secondSet.add(name);
    }

    public void findElementFromSet(String name) {
        boolean isElemInHashSet = firstSet.contains(name);
        boolean isElemInTreeSet = secondSet.contains(name);
    }

    public void deleteElementFromSet(String name) {
        firstSet.remove(name);
        secondSet.remove(name);
    }







    // nie moga byc duplikaty - metody equals i hashcode!
    // treeset uwzglednia kolejnosc dodawanych elementow, hashset nie
    // hashset ma w impelementacji pod spodem mape, elementy dodawane sa sprawdzane poprzez metode hashcode
    // treeset ma posortowane drzewo

}
