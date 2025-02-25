package services;

import entities.Product;

import java.util.List;

public class CalculationService {
    public static <T extends Comparable<? super T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }

        /*outra forma de encontrar o maior é através do 'compareTo'
        ele retorna que o valor é maior quando o compareTo for maior que zero,
        menor se o compareTo for menor que zero  ou igual se o compareTo for igual a zero.
         */
        T max = list.get(0);
        for(T item : list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}
