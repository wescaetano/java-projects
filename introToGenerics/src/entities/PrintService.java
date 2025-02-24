package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> list = new ArrayList<>();

    public void addValue(T obj){
        list.add(obj);
    }

    public T first(){
        if(list.isEmpty()){
            throw new IllegalStateException("The list is empty!");
        }
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        System.out.print(list.get(0));
        for(int i=1; i<list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.print("]");
    }
}
