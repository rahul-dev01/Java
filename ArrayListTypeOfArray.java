import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTypeOfArray {

    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Rauhl");
        names.add("Amit");
        names.add("priya");

        // System.out.println("Names : " + names);

        // for(String x : names){
        //     System.out.println(x);
        // }

        System.out.println("Name at 0 index : "+names.get(0));

        // names.remove("priya");

        // names.remove(0);

        for(String x : names){
            System.out.println(x);
        }

        // To check the size of Array List 
        int size = names.size();
        System.out.println("The size of ArrayList : " + size);

        boolean bol = names.isEmpty();
        System.out.println("To check ArrayList is Empty Or Not " +bol);

        Collections.sort(names);

        for(String x : names){
            System.out.println(x);
        }

        


    }
}