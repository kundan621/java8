import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Filter Class
	
	local wala
 */
public class Filter {
    public static void main(String [] args){

        List<String>  list= Arrays.asList("My","Name","is","Kundan","Kumar");

        //filter
        list.stream().filter(s->!s.equals("is")).forEach(System.out::println);

        //collect
        List<String> listNew=list.stream().map(String::toUpperCase).collect(Collectors.toList());
        listNew.forEach(System.out::println);

        //findany() or null
        String name=list.stream().filter(name1->name1.equals("Kundan")).findAny().orElse(null);
        System.out.println(name);
    }
}
