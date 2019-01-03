
public class GlobalLocalTest3 {
	
	int instanceNum = 10;
	static int globalNum = 20;
	
	void numbering(){
		int localNum = 30;
		
		System.out.println("instanceNum = " + instanceNum);
		System.out.println("globalNum = " + globalNum);
		System.out.println("localNum = " + localNum);
	}
	
}
