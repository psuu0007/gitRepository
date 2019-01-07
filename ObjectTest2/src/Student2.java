
public class Student2 {

	String name = "";
	int ban = 0;
	int num = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;

	Student2(){
		
	}
	
	Student2(String name, int ban, int num, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		int result = kor + eng + math; // this ���ʿ� ����
		return result;
	}

	double getAverage() {
		double result = 0;
		result = (kor + eng + math);
		result = result / 3;
		result = (result * 1000) / 1000.0;
		return result;
	}
	
	double anotherAverage() {
		double result = 0;
		result = kor + eng + math; // 총점
		result = result / 3.0;   // 평균
		result = Math.round(result * 100); // 3 째 자리에서 반올림(평균 * 1000) 
		result = result / 100.0;   // 소수점 셋째자리에서 반올림 완성
//		((Math.round((kor+eng+math))/3)*1000)/1000.0;
		
		System.out.println(result);
		return result;
	}
	
	void studentinfo() {
		
	}

}
