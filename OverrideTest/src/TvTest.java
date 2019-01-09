
public class TvTest {

	public static void main(String[] args) {

		Tv tv = new Tv();
		
		tv.power();
		tv.channelUp();
		tv.tvInfo();
		
		
		CaptionTv cTv = new CaptionTv();
		cTv.channelUp();
		cTv.channelUp();
		cTv.tvInfo();
		
		
	}
	
}
