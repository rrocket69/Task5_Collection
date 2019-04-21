import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Controller {

    public void startAction() {
        //Task1
        System.out.println("Task1");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(5);
        arr.add(7);
        arr.add(3);
        arr.add(2);
        arr.add(2);

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(!map.containsKey(arr.get(i)))
                map.put(arr.get(i),1);
            else {
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }
        }
        System.out.println(map);


        //Task2
        System.out.println("Task2");
        UndeletableArrayList<Integer> undeletableArrayList = new UndeletableArrayList<>();
        undeletableArrayList.add(3);
        undeletableArrayList.add(2);
        undeletableArrayList.add(3);
        undeletableArrayList.add(4);
        undeletableArrayList.add(5);
        System.out.println(undeletableArrayList.toString());


    }
}
