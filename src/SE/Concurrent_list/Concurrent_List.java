package SE.Concurrent_list;

import java.util.*;

/**
 * Created by Yuriy on 06.04.2017.
 */


public class Concurrent_List<T> implements List<T> {
   private volatile Object[] arr = new Object[1000000];
    private int pointer = 0;
    @Override
    public int size() {
        int size = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] != null) {
                size += 1;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size(); i++) {
            if (get(i).equals(o)) return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Objects.requireNonNull(o);
        arr[size()+1] = o;
        if (arr[size()+1].equals(o)) return true;
        return false;
    }

    @Override
    public boolean remove(Object o) {

        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if(index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return (T) arr[index];
    }

    @Override
    public Object set(int index, Object element) {
        return this.arr[index] =arr[index];
    }

    @Override
    public void add(int index, Object element) {
        Objects.requireNonNull(element);
        arr[index] = element;
        if(pointer == arr.length-1);
           /* resize(array.length*2);
        arr[pointer++] = item;*/
    }

    @Override
    public T remove(int index) {
        if (index > size()) throw new IndexOutOfBoundsException();

        Object o = arr[index];
        if (index == size()){
            arr[index] = null;
            return (T) o;
        }

        int size = size();
        for (int i = index; i < size; i++) {
            arr[i] = arr[index+1];
        }
        return (T) o;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
