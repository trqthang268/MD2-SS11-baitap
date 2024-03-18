package baitap.baitap12.ra;

import java.util.Arrays;

import static java.util.Objects.checkIndex;

public class MyList<E>{
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    public void add(int index, E element){
        if (size == elements.length){
            ensureCapacity(2);
        }elements[size++]=element;
//        ensureCapacity(2);
//        for (int i = size -1; i >= index ; i--) elements[i+1]=elements[i];
//        elements[index] = element;
//        size++;
    }
    public E remove(int index){
        checkIndex(index);
        E o = (E) elements[index];
        for (int j = index; j < size-1; j++) {
            elements[j]=elements[j+1];
        }
        elements[size-1]=null;
        size--;
        return null;
    }

    private void checkIndex(int index) {
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("index "+index+" out of bounds");
        }
    }

    int size(){
        return 0;
    }
    public E clone(){
        return null;
    }
    boolean contains(E o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }
    public boolean add(E o){
        Object newElement[] = new Object[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newElement[i]=elements[i];
        }
        newElement[newElement.length-1]=o;
        elements=newElement;
        return true;
    }
    public void ensureCapacity(int minCapacity){
        int newSize = elements.length*minCapacity;
        elements= Arrays.copyOf(elements, newSize);
    }
    public E get (int i){
        if(i>=size || i<0){
            throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
        };
        return (E) elements[i];
    }
    public void clear(){
        elements = (Object[]) (new Object[DEFAULT_CAPACITY]);
        size = 0;
    }
}
