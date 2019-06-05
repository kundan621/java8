package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Excercise {

	public static void main(String[] args) {

	List<Person> people=Arrays.asList(
			new Person("Kundan", "Kumar", 18),
			new Person("Prashant", "Kumar", 18),
			new Person("Mritunjay", "kashyap", 18),
			new Person("Mona", "darling", 18));
	
	/**
	 * By java 7 way
	 */
	
    //sort the list by name	
	Collections.sort(people, new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getFirstname().compareTo(o2.getFirstname());
		};
		
		
	});
	
	
	//	//print all the elements
	for(Person p:people) {
		System.out.println(p);
	}
	
	/**
	 * By java 8 way
	 * 
	 */
	List<Person> people1=Arrays.asList(
			new Person("Kundan", "Kumar", 18),
			new Person("Prashant", "Kumar", 18),
			new Person("Mritunjay", "kashyap", 18),
			new Person("Mona", "darling", 18));
	
	
	//sort
	Collections.sort(people1, (p1,p2)->p1.getFirstname().compareTo(p2.getFirstname()));
	
	//print all
	people1.forEach(System.out::println);
	
	//filter
	people1.stream().filter(p->p.getFirstname().startsWith("M")).forEach(System.out::println);
	printwithfilter(people1,p->p.getFirstname().startsWith("M"));
			
	}

	private static void printwithfilter(List<Person> people1, Consumer<Person> consume) {
		for(Person p:people1) {
			consume.accept(p);
		}
		
	}



}
