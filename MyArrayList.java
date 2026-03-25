package exercicoetreinojunior;

public class MyArrayList implements ArrayList  {
	private int[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 5;

    public MyArrayList() {
        this.elements = new int[INITIAL_CAPACITY];
        this.size = 0;
    }

   
    private void ensureCapacity() {
        if (size == elements.length) {
            int[] newElements = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    @Override
    public void insertAt(int index, int element) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Índice inválido");
        ensureCapacity();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }
    @Override
    public void addFirst(int element) {
        insertAt(0, element);
    }
    @Override
    public void addLast(int element) {
        insertAt(size, element);
    }

    @Override
    public int removeAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Índice inválido");
        int removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return removedElement;
    }
    @Override
    public int removeFirst() {
        return removeAt(0);
    }
    @Override
    public int removeLast() {
        return removeAt(size - 1);
    }
    @Override
    public boolean remove(int element) {
        int index = find(element);
        if (index != -1) {
            removeAt(index);
            return true;
        }
        return false;
    }
    @Override
    public int find(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) return i;
        }
        return -1;
    }
    @Override
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Índice inválido");
        return elements[index];
    }
    @Override
    public void set(int index, int element) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Índice inválido");
        elements[index] = element;
    }
    @Override
    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + (i < size - 1 ? ", " : " "));
        }
        System.out.println("]");
    }

}
