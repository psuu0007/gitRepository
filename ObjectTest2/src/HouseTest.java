
public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int window = 1;
		int door = 1;
		int room = 1;
		
		House myhouse = new House(window,door,room);
		myhouse.housePrint();
		
		House myHouse2 =new House(1, 5);
		myHouse2.housePrint();

		House myHouse3 =new House(1);
		myHouse3.housePrint();
	}

}
