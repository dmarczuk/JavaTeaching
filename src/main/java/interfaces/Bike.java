package interfaces;

public class Bike implements Moveable {
    private int speed;

    public Bike() {
        this.speed = 0;
    }

    @Override
    public int speedUp() {
        speed = speed + 1;
        return speed;
    }

    @Override
    public int speedDown() {
        speed = speed - 1;
        return speed;
    }

    @Override
    public String getName() {
        return "Bike";
    }


}
