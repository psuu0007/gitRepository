import java.util.Scanner;

public class WrapperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originDate = "2019년02월25일";
		String originDate2 = "2020년02월25일";
		String originDate3 = "2021년02월25일";
		
		DateUtil dateUtil = new DateUtil();
		String inputStr = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		inputStr = scan.nextLine();
		
		int userInputNum = 0;
		userInputNum = Integer.parseInt(inputStr);
		
		dateUtil.dateOperMethod(originDate, userInputNum);
		
		
//		dateUtil.dateOperMethod(originDate2, 2);
//		dateUtil.dateOperMethod(originDate3);
		
//		System.out.println((year-1) + "년" + month + "월" + day + "일");
//		System.out.println((year) + "년" + month + "월" + day + "일");
//		System.out.println((year+1) + "년" + month + "월" + day + "일");
		
		
		
		
		
		
		
		
//		System.out.println(year + "년" + month + "월" + (day+3)  + "일");
//		System.out.println((year+1) + "년" + (month+3) + "월" + (day-9) + "일");
		
	}

}
