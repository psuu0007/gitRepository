
public class Notebook {

// 제조사 			LG	

//	price	 	다를 수 있다.
//	hardDisk	다를 수 있다.
//	memory		다를 수 있다.
	int price = 0;
	int hardDisk = 0;
	int memory = 0;
	static String madeIn = "";

	Notebook() {

	}

	Notebook(int price, int hardDisk, int memory) {
		this.price = price;
		this.hardDisk = hardDisk;
		this.memory = memory;
	}

	int get(int a, int b) {
		int total = a + b;
		
		return total;
	}
	
	void print() {
		System.out.println("제조사 : " + Notebook.madeIn);
		System.out.println("가격 : " + price);
		System.out.println("용량 : " + hardDisk + "GB");
		System.out.println("메모리 : " + memory + "G");
		System.out.println();
	}
//	메서드
//	제품 정보 this.info

	
}
