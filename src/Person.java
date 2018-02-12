
public class Person {
Person(){
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("mohit","sharma");
		Person x = new Person("19thsept");

	}
	
	public Person(String dateofbirth){
		String dob = dateofbirth;
		System.out.println(dob);
		
	}
	
	public Person(String first, String last)
	{
	    String firstName = first;
	    System.out.println(first);
	    String lastName = last;
	    System.out.println(last);
	}
	
	
	public String gender(String g){
		System.out.println("test gentder");
		return g;
	}

}
