package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {


    public Predicate<List<String>> isValuesStartWithUpperCase()  {
        return x -> {
            boolean res = true;
            for(String item:x){
                if(!Character.isUpperCase(item.charAt(0))){
                    res = false;
                    break;
                }
            }
            return res;
        };
        //throw new UnsupportedOperationException("You should implement this method.");

    }


    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return x ->{
            int len = x.size();
            for(int i =0; i<len; i++){
                int item = x.get(i);
                if(item % 2 == 0){
                    x.add(item);
                }
            }
        };

        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            List<String> l = new ArrayList<>();
            for(String item: values){
                int count = 0;
                if(!Character.isUpperCase(item.charAt(0))){
                    continue;
                }
                else{
                    if(!item.endsWith(".")){
                        continue;}
                    else{
                        for(int j = 0; j<item.length(); j++){
                            if(Character.isWhitespace(item.charAt(j))){
                                count ++ ;
                            }
                        }
                    }
                }
                if(count >=3){l.add(item);}
            }
            return l;
        };
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return x->{
            Map<String,Integer> map = new HashMap<>();
            for(String str: x){
                map.put(str, str.length());
            }
            return map;
        };
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> newList = new ArrayList<>();
            newList.addAll(list1);
            newList.addAll(list2);
            return newList;
        };
        //throw new UnsupportedOperationException("You should implement this method.");
    }
}
