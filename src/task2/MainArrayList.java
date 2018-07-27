package task2;

import java.util.ArrayList;
import java.util.Collection;

public class MainArrayList extends ArrayList {
/*    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;
    */

    public static void main(String[] args) {
        MainArrayList list = new MainArrayList();
        list.add(3);
        list.add(41);
        list.add(40);
        list.add(45);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }

    @Override
    public boolean add(Object o) {
        return super.add(o);
    }

  /*  public Object Myadd(Object o) {
        int arrLeng = array.length;
        if(pointer == arrLeng-1){
            resize(arrLeng+((arrLeng/2)+1));
        }
        array[pointer++] = o;
    }


    public void resize(int newLength){
        Object[] newArr = new Object[newLength];
        System.arraycopy(array, 0, newArr,0, pointer);
        array = newArr;

    }*/

    @Override
    protected void removeRange(int fromIndex, int toIndex) {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return -1;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }
}
