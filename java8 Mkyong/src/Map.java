import java.util.Arrays;
import java.util.List;

public class Map {

    public static void main(String [] args){
        List<Person> listPerson= Arrays.asList(new Person("kundan",28),new Person("Rasuhan",32),new Person("Amar",30));

        listPerson.stream().map(Person::getName).forEach(System.out::println);



    }



}


