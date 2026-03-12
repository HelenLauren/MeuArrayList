public class ArrayList<T> {
    private Object[] elements;
    private int size;

    public ArrayList() {
        elements = new Object[10]; //começa com tamanho de array = 10
        size = 0;
    }

    private void increaseCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length + (elements.length / 2); //aumenta 50% de capacidade

            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }

            elements = newArray;
        }
    }

    //add
    public void add(T element) {
        increaseCapacity();
        elements[size] = element;
        size++;
    }

    //get
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    //set
    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        elements[index] = element;
    }

    //remove
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;
    }

    //contains
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    //indexOf
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    //toArray
    public Object[] toArray() {
        Object[] newArray = new Object[size];

        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }

        return newArray;
    }

    //saber somente o tamanho que a lista está no momento
    public int size() {
        return size;
    }
}

