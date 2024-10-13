package generic;

public class GenericClass<T extends Number> {

    private T value;

    public <T> T getValue(T[] array, int index) {
        return array[index];
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


}
