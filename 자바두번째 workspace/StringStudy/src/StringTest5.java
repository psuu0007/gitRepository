
public class StringTest5 {

	public static void main(String[] args) {

//		String originStr = "dog, cat, bird, bear";

// 		split을 사용하지 않고 dog, cat, bird, bear의 단어를 변수에 저장 및 출력하시오

		// 2019/02/22
		String date = "2019/02/22";
		String[] arr = date.split("/", 3);

		System.out.println(date);
		System.out.println(arr[0] + "년" + arr[1] + "월" + arr[2]);

//		100,000,000
	}

}
