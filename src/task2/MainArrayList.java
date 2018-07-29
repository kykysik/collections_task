package task2;

import java.util.AbstractList;
import java.util.Collection;

public class MainArrayList<E> extends AbstractList<E> {

    private E[] values = (E[]) new Object[0];




    public static void main(String[] args) {
        MainArrayList<Integer> list = new MainArrayList();
        list.add(3);
        list.add(41);
        list.add(40);
        list.add(45);
        System.out.println(list);
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean add(E o) {
        try{
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length-1] = o;
            return true;
        }catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }
}
