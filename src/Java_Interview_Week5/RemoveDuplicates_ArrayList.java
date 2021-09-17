package Java_Interview_Week5;

import com.sun.xml.internal.ws.model.wsdl.WSDLOutputImpl;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Sangam");
        list.add("Rahul");
        list.add("Sagar");
        list.add("Rahul");
        // System.out.println(list);

        //create new arraylist object
        List<String> newList = new ArrayList<>();
        for (String each : list) {
            if (!newList.contains(each)) {

                newList.add(each);
            }
        }
//retrieve data/elements from obj
       for(String each2: newList) {
        System.out.println(each2);
}
}
}