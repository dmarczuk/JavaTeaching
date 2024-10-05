package interfaces;

public interface Moveable {
    // moga zawierac deklaracje stalych oraz deklaracje metod
    // od javy 8 takze metody domyslne oraz statyczne, ktore moga zawierac implementacje
    // od javy 9 takze metody prywatne
    // przyklady interfejsow: List, Set
    // List list = new ArrayList();


    //private static final String MAX_SPEED;
    //int speed = 100; ???
    public static final int MAX_SPEED = 0;

    int speedUp();

    int speedDown();

    default String getName() {
        return "NameOfVehicle";
    }

    // mozna sprawdzic przy javie 8
    private String method() {
        String description = "private method to for example avoid dupicate code";
        return description;
    }
}
