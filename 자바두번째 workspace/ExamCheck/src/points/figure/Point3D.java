package points.figure;

public class Point3D extends Point{

	int z;
	
	Point3D(){
		
	}
	
	public Point3D(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String getLocation() {
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
	
}
