
public class Visitor extends Person{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1 = new Person();
		obj1.gender();
		
		

	}
	
	public int visitorID(int y){
		System.out.println("test visitor ID");
		return y;
	}

}
