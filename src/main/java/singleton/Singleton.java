package singleton;

public class Singleton {
    private static boolean isCreated = false;

    private Singleton() {

    }

    public static Singleton createSingleton() {
        if(isCreated == false) {
            Singleton firstSingleton = new Singleton();
            isCreated = true;
            return firstSingleton;
        } else {
            return null;
        }

    }

}
