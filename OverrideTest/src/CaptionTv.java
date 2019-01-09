
public class CaptionTv extends Tv{

	boolean caption = false;
	
	void displayCaption(String text) {
		if(caption == true) {
			System.out.println(text);
		}
	}
	
	void tvInfo() {
		System.out.println("자막 Tv"); // 변경
		System.out.println("전원 상태: " + power); // 그대로 사용 -> 재사용
		System.out.println("채널 값: " + channel);
		System.out.println("음소거 상태: " + caption); // 새로운 내용 추가
	}
	
}
