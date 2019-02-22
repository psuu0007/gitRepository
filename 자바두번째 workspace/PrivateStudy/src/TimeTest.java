public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time();
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		t.setHour(22);
		hour = t.getHour();
//		System.out.println(t.hour);
		System.out.println(hour);
		
		t.setMinute(39);
		minute = t.getMinute();
		System.out.println(minute);
		
		t.setSecond(17);
		second = t.getSecond();
		System.out.println(second);
		
		System.out.println();
		System.out.println("=========================");
		System.out.println("현재 시간은 " + hour + "시 " + minute + "분 "
							+ second + "초 입니다.");
		
	}
}
