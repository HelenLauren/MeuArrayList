public class ArrayList<T> {
    private Object[] elements;
    private double size;

    public ArrayList() {
        elements = new Object[10]; //começa com tamanho de array = 10
        size = 0;
    }

    private void increaseCapacity() {
        int newCapacity = elements.length + (elements.length / 2); //aumenta 50% de capacidade

        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }

        elements = newArray;
    }
}
