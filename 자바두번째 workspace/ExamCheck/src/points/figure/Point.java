package points.figure;

public class Point {

	int x, y;
	
	Point() {
		System.out.println();
	}
	
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
	
}
