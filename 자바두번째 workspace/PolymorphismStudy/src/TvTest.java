
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv = new Tv();

		tv.channelUp();

		System.out.println(tv.channel);
		System.out.println("============================");
		
		CaptionTv cTv = new CaptionTv();

		cTv.channelUp();
		cTv.channelUp();

		System.out.println(cTv.channel);
		
//		cTv.caption();

		System.out.println("============================");

		Tv tvObj = new CaptionTv();

		tvObj.channelUp();
		tvObj.channelUp();
		tvObj.channelUp();
		tvObj.channelDown();

		System.out.println(tvObj.channel);
//		tvObj.caption();
		
		tvObj.power();
		
//		Tv cTv3 = tvObj;
//		cTv3.caption();
		
		System.out.println("여기 위에 다============================");
		
//		CaptionTv cTv2 = new Tv(); // 오류 발생
		
		
		
		
//		Tv smartTv = new SmartTv();
		
		
	}

}
