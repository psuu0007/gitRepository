package product.test;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Tv tv = new Tv();
		
		MuteTv muteTv = new MuteTv();
		
		muteTv.power();
		muteTv.channelUp();
		muteTv.channelUp();
		muteTv.channelUp();
		muteTv.channelDown();
		muteTv.volumeUp();
		muteTv.volumeUp();
		muteTv.volumeUp();
		muteTv.volumeDown();
		
		muteTv.printInfo();
	}

}
