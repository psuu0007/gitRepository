package exam.test.shoppingMall;

public class ShoppingMallSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 각 가게의 정보를 출력하시오
		
		// 10명의 같은 반 동기들을 생성
		Customer[] customerArr = new Customer[3];
		CustomerUtil customerUtil = new CustomerUtil();
		
//		Customer[] BuyerArr = new Customer[10];
		
		for (int i = 0; i < customerArr.length; i++) {
			customerArr[0] = customerUtil.getCreateCustomer();
		}
		
//		Customer janghunil = new Customer("장훈일", 39, 100000);
//		Customer parkdaeseung = new Customer("박대승", 25, 100000);
//		Customer kimchunghyun = new Customer("김충현", 28, 10000);
//		Customer jungminsung = new Customer("정민성", 28, 10000);
//		Customer leemyungsun = new Customer("이명선", 26, 1000000);
//		Customer choimungwun = new Customer("최문권", 28, 1000000);
//		Customer songjiwon = new Customer("송지원", 22, 1900000);
//		Customer chohyemi = new Customer("조혜미", 36, 90000);
//		Customer chohyesun = new Customer("조혜선", 23, 9000000);
//		Customer parkgangin = new Customer("박강인", 36, 800000);
				
		//가게 생성
		ProductStore computerStore = new ProductStore("최고의 컴퓨터", 100000);
		ProductStore appleStore = new ProductStore("거창 사과", 1000);
		ProductStore huAppleStore = new ProductStore("허참 사과", 1500);
		ProductStore guAppleStore = new ProductStore("거참 사과", 2500);
		ProductStore pineAppleStore = new ProductStore("파인애플", 10000);
		ProductStore kiaCarStore = new ProductStore("기아차", 8000);
		
		// 5명의 친구들은 모두 컴퓨터를 구입한다
//		computerStore.buy(janghunil);
//		computerStore.buy(parkdaeseung);
//		computerStore.buy(kimchunghyun);
//		computerStore.buy(jungminsung);
//		computerStore.buy(leemyungsun);
		
		for (int i = 0; i < customerArr.length; i++) {
			computerStore.buy(customerArr[i]);
		}
		
		
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
//		appleStore.buy(customerArr[5]);
//		huAppleStore.buy(customerArr[6]);
//		guAppleStore.buy(customerArr[7]);
//		pineAppleStore.buy(customerArr[8]);
//		kiaCarStore.buy(customerArr[9]);
		
		// 그리고 각 친구들의 정보를 출력
		System.out.println();
		//훈일
//		computerStore.afterBuy(janghunil);
//		System.out.println("이름 : " + janghunil.name);
//		System.out.println("나이 : " + janghunil.age);
//		System.out.println("소지금 : " + janghunil.money);
		System.out.println();
		
		//대승
//		computerStore.afterBuy(parkdaeseung);
//		System.out.println("이름 : " + parkdaeseung.name);
//		System.out.println("나이 : " + parkdaeseung.age);
//		System.out.println("소지금 : " + parkdaeseung.money);
		System.out.println();
		
		//충현
//		computerStore.afterBuy(kimchunghyun);
//		System.out.println("이름 : " + kimchunghyun.name);
//		System.out.println("나이 : " + kimchunghyun.age);
//		System.out.println("소지금 : " + kimchunghyun.money);
		System.out.println();
		
		//민성
//		computerStore.afterBuy(jungminsung);
//		System.out.println("이름 : " + jungminsung.name);
//		System.out.println("나이 : " + jungminsung.age);
//		System.out.println("소지금 : " + jungminsung.money);
		System.out.println();
		
		//명선
//		computerStore.afterBuy(leemyungsun);
//		System.out.println("이름 : " + leemyungsun.name);
//		System.out.println("나이 : " + leemyungsun.age);
//		System.out.println("소지금 : " + leemyungsun.money);
		System.out.println();
		
		//문권
//		appleStore.afterBuy(choimungwun);
//		System.out.println("이름 : " + choimungwun.name);
//		System.out.println("나이 : " + choimungwun.age);
//		System.out.println("소지금 : " + choimungwun.money);
		System.out.println();
		
		//지원
//		huAppleStore.afterBuy(songjiwon);
//		System.out.println("이름 : " + songjiwon.name);
//		System.out.println("나이 : " + songjiwon.age);
//		System.out.println("소지금 : " + songjiwon.money);
		System.out.println();
		
		//혜미
//		guAppleStore.afterBuy(chohyemi);
//		System.out.println("이름 : " + chohyemi.name);
//		System.out.println("나이 : " + chohyemi.age);
//		System.out.println("소지금 : " + chohyemi.money);
		System.out.println();
		
		//혜선
//		pineAppleStore.afterBuy(chohyesun);
//		System.out.println("이름 : " + chohyesun.name);
//		System.out.println("나이 : " + chohyesun.age);
//		System.out.println("소지금 : " + chohyesun.money);
		System.out.println();
		
		//강인
//		kiaCarStore.afterBuy(parkgangin);
//		System.out.println("이름 : " + parkgangin.name);
//		System.out.println("나이 : " + parkgangin.age);
//		System.out.println("소지금 : " + parkgangin.money);
		
		for (int i = 0; i < customerArr.length; i++) {
			System.out.println(customerArr[i]);
		}
		
		
	}

}
