package interfaces;

import collections.map.Person;

public class Car extends Vehicle{

    private int max_speed;

    public Car(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }
}
