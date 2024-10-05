package string;

public class StringManager {

    public static void createStrings() {
        String name1 = "car";
        String name2 = "car";
        String name3 = new String("car");
        String name4 = new String("car");
        System.out.println(name1 == name2); // true or false?
        System.out.println(name3 == name4); // true or false?
        System.out.println(name1.equals(name3)); // true or false?
        System.out.println(name3.equals(name4)); // true or false?
    }

    public static void createBigString() {

        long startTime = System.currentTimeMillis();
        String string = "";
        for(int i = 0; i <= 100000; i++) {
            string = string + "a";
        }
        long finishTime = System.currentTimeMillis();
        long timeForString = finishTime - startTime;

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("");
        for(int i = 0; i <= 100000; i++) {
            stringBuilder.append("a");
        }
        String string2 = stringBuilder.toString();
        finishTime = System.currentTimeMillis();
        long timeForStringBuilder = finishTime - startTime;

        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("");
        for(int i = 0; i <= 100000; i++) {
            stringBuffer.append("a");
        }
        String string3 = stringBuffer.toString();
        finishTime = System.currentTimeMillis();
        long timeForStringBuffer = finishTime - startTime;

        System.out.println("Time for String: " + timeForString);
        System.out.println("Time for StringBuilder: " + timeForStringBuilder);
        System.out.println("Time for StringBuffer: " + timeForStringBuffer);

        //refactor tej metody?? czy cos mozna poprawic?
    }

    public static void checkEqualsAndHashcodeContract() {
        String first = "firstName";
        String second = "secondName";
        int firstHash = first.hashCode();
        int secondHash = second.hashCode();

        boolean firstEquals = first.equals(second);

        String one = "Aa";
        String two = "BB";

        int oneHash = one.hashCode();
        int twoHash = two.hashCode();

        boolean secondEquals = one.equals(two);

        System.out.println(firstHash);
        System.out.println(secondHash);
        System.out.println(firstEquals);

        System.out.println(oneHash);
        System.out.println(twoHash);
        System.out.println(secondEquals);




    }

}
