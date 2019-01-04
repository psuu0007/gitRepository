import java.util.Scanner;

public class NotebookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		출력 
		int price = 0;
		int hardDisk = 0;
		int memory = 0;
		
		Notebook.madeIn = "LG";
		
		Notebook[] noteBookArr = new Notebook[3];
		
		for (int i = 0; i < noteBookArr.length; i++) {
			price = (i+1) + 10000;
			hardDisk = (i+1) * 500;
			memory = (i+1) * 4;
			noteBookArr[i] = new Notebook(price, hardDisk, memory);
		}
		
		for (int i = 0; i < 2; i++) {
			noteBookArr[i].print();
		}
		
//		price = 20330;
//		hardDisk = 500;
//		memory = 4;
//		Notebook laptop2 = new Notebook(price, hardDisk, memory);
//		laptop2.print();
//		
//		price = 30000;
//		hardDisk = 500;
//		memory = 4;
//		Notebook laptop3 = new Notebook(price, hardDisk, memory);
//		laptop3.print();
		
	}

}

