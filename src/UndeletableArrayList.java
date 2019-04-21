public class UndeletableArrayList<T> {
    private final int INIT_SIZE = 3;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;


    public void add(T item){
        if(pointer == array.length-1)
            resize(array.length*2+1);
        array[pointer++] = item;
    }
    public T get(int index){
        return (T) array[index];
    }
    public int size(){
        return pointer;
    }
    private void resize(int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(array,0,newArray,0,pointer);
        array = newArray;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[ ");

        for (Object iter:array) {
            if(iter!=null)
            stringBuilder.append(iter).append(", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-2);
        return stringBuilder.append("]").toString();
    }
}
