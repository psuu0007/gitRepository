import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gugudan2 {

	List<Integer> ggdList = new ArrayList();

	public Gugudan2() {

	}

	public Gugudan2(int num) {
		int num2 = 0;
		for (int i = 1; i <= 9; i++) {
			num2 = (num * i);
			ggdList.add(num2);

		}
	}

	public void Gugudan2Print(int num) {
		Iterator<Integer> it = ggdList.iterator();
		
		int danPos = 1;
		String danStr = "";
		
		while(it.hasNext()) {
			danStr = num + " * " + danPos + " = " + it.next();
			
			System.out.println(danStr);
			danPos++;
		}
		
	}

}
