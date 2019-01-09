
public class Point3DTest {

	public static void main(String[] args) {

		Point3D p3 = new Point3D();
		String locationStr = "";

		p3.x = 1;
		p3.y = 2;
		p3.z = 3;

		locationStr = p3.getLocation();

		System.out.println(locationStr);

		Point p = new Point();
		
		p.x = 10;
		p.y = 20;
		
		locationStr = p.getLocation();
		System.out.println(locationStr);
		
		
		
		
		
		
	}

}
