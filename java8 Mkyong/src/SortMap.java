import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {
    public static void main(String args[]){

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Kundan");
        map.put(2,"Abhishek");
        map.put(3,"Raushan");
        map.put(4,"xyzz");

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(System.out::println);

        Map<Integer,String> sortedMap=new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x->sortedMap.put(x.getKey(),x.getValue()));
        sortedMap.forEach((k,v)->System.out.println(k+" "+v ));






    }
}
