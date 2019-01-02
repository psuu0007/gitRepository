
public class Gugudan {

	void gugudanOnePrint(int dan) {
		System.out.println("==" + dan + "단==");
		for (int i = 0; i < 9; i++) {
			System.out.println(dan + " * " + (i+1) + " = " + (dan * (i+1)));
		}
	}
	
}
