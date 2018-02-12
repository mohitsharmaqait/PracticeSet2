
public class Employee extends Person {

	private static int id;
	private static String org;

	Employee()
	{
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Employee empID = new Employee();
		//Employee org = new Employee();
		
		Employee p = new Employee();
		p.empid(id);
		p.org(org);
		
	}
	
	public void empid(int i){
		int id = i;
		System.out.println(id);
		
	}
	
	public void org(String o){
		String org = o;
		System.out.println(org);
		
	}

}
