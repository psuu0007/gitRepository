import java.util.HashMap;
import java.util.Scanner;

public class StudyMapTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> userMap = new HashMap();
		// 키와 밸류
		userMap.put("myId", "1234");
		userMap.put("asdf", "1111");
//		userMap.put("asdf", "1234");
		
//		System.out.println(userMap.get("myId"));
//		System.out.println(userMap.get("asdf"));
		String userIdInput = "myId";
		String userPwdInput = "1234";
		
		if(userMap.get(userIdInput).equals(userPwdInput)) {
			System.out.println("비밀번호가 일치합니다");
		}
		
		if("1234".equals("1234")) {
			System.out.println("비밀번호가 일치합니다");
		}
		
	}

}
