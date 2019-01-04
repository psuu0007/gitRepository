
public class NotebookTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		출력 
		
		
		Notebook.madeIn = "LG";
		
		int price = 0;
		int hardDisk = 0;
		int memory = 0;
		Notebook laptop1 = new Notebook(price, hardDisk, memory);
		laptop1.print();
		
		int price2 = 0;
		int hardDisk2 = 0;
		int memory2 = 0;
		Notebook laptop2 = new Notebook(price2, hardDisk2, memory2);
		laptop2.print();
		
		int price3 = 0;
		int hardDisk3 = 0;
		int memory3 = 0;
		Notebook laptop3 = new Notebook(price3, hardDisk3, memory3);
		laptop3.print();
		
	}

}

