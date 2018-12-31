
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time koreaTime = new Time();
		Time americanTime = new Time();
		
		koreaTime.hour = 5;
		koreaTime.minute = 26;
		koreaTime.second = 31;
		
		americanTime.hour = 3;
		americanTime.minute = 26;
		americanTime.second = 31;
		
		System.out.println("한국시간: " + "시" + koreaTime.hour + "분" 
		+ koreaTime.minute + "초" + koreaTime.second);
		System.out.println("미국시간: " + "시" + americanTime.hour + "분" 
				+ americanTime.minute + "초" + americanTime.second);
		
	}

}
