package Java_Interview_Week5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortByMap {
    /*
        Write a method that can sort the map by values
     */
    public static void main(String[] args) {

    }
    public Map<String, Integer> sortByMap(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each: list){
            map.put(each.getKey(), each.getValue());
        }

        return map;
    }
}
