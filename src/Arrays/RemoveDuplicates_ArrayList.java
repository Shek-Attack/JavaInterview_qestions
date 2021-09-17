package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates_ArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("She");
        list.add("He");
        list.add("They");
        list.add("He");
        list.add("It");
        list.add("He");

        list.addAll(Arrays.asList("HE","SHE","THEY","IT","HE","SHE"));
        System.out.println(list);

        //create new arrayList object
        List<String> NewList = new ArrayList<>();
        for (String each:list) {
            if(!NewList.contains(each)){
                NewList.add(each);
            }
        }
         //retrieve data/elements from obj
        for(String newEach: NewList){
            System.out.print(newEach + " ");
        }
    }
}
