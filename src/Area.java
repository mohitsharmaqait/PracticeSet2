
public class Area {
	
	int area;
	
	public Area(int l, int w){
		area = l*w;
		System.out.println("Area of rectangle" + area);
		
	}
	
	public Area(int r){
		area = r*r;
		System.out.println("area of square" +area);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Area rec = new Area(2,3);
		//Area cir = new Area(7);
		
	}

}
