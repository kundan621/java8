import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ForEach {
	
	public static void main(String args[]) {
		/**
		 * Map Test
		 */
		Map<String, Integer> items= new HashMap<>();
		items.put("A",10);
		items.put("B",10);
		items.put("C",10);
		items.put("D",10);
		items.put("E",10);
		items.put("F",10);
		//PRINT USING FOR EACH
		for(Entry<String, Integer> entry: items.entrySet()){
			System.out.println(entry.getKey());
		}
		//print using lambda
		items.forEach((Key,value)->System.out.println(Key));
		
		//print using iterator
		/**
		 * List
		 */
		
		List<String> list=new ArrayList<>();
		list.add("Kundan");
		list.add("Mritunjay");
		list.add("prashant");
		list.add("drishya");
		list.add("Suchi");
		//print using java 8
		list.forEach((names)->System.out.println(names));
		//Method references
		list.forEach(System.out::println);
		list.forEach((names)->{
			if(!names.equalsIgnoreCase("drishya"))
		System.out.println(names);
		
		});
		list.stream().filter(a->!a.equalsIgnoreCase("drishya")).forEach(System.out::println);
		
		//.collect(Collecctors.toList();
		List<String> list1=list.stream().filter(a->a.equalsIgnoreCase("kundan")).collect(Collectors.toList());
		list1.forEach(System.out::println);
		
		//filter any object
		List<Person> listPerson=Arrays.asList(new Person("kundan", 25),new Person("suchi", 23),new Person("Prashant",24));
		
		//to filter objects in the stream
	    listPerson.stream().filter(s->!s.getName().equalsIgnoreCase("prashant")).forEach(System.out::println);
		//to get the list of objects
	    List<Person> listPerson1=listPerson.stream().filter(s->s.getName().startsWith("d")).collect(Collectors.toList());
	    listPerson1.forEach(System.out::println);
	    
	    //to get the single object
	    Person person1=listPerson.stream().filter(p->p.getAge()==25).findAny().orElse(null);
	    System.out.println(person1);
	    
	    //convert stream to string
	    String name=listPerson.stream().filter(p->p.getAge()==25).map(Person::getName).findAny().orElse(null);
	    		System.out.println(name);
	    		
	    //uppercase
	    List<String> smallcase=Arrays.asList("a","b","c","d");
	    smallcase.stream().map(a->a.toUpperCase()).forEach(System.out::println);
	    
	    

		//filter any object
		List<Person> listPerson2=Arrays.asList(new Person(null, 25),new Person("suchi", 23),new Person("Prashant",24));
		
	    List<String> listNames= listPerson2.stream().filter(p->p.getName()!=null).map(Person::getName).collect(Collectors.toList());
	    listNames.forEach(System.out::println);
		
	}

}

    class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
    
    

    
}
