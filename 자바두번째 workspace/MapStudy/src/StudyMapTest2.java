import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudyMapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> studentMap = new HashMap();
		
//		키 밸류
		studentMap.put("김자바", 90);
		studentMap.put("김자바", 100);
		studentMap.put("이자바", 100);
		studentMap.put("강자바", 80);
		studentMap.put("안자바", 90);
		
		Set set = studentMap.entrySet();
		Iterator it = set.iterator();
		
		Map.Entry e = null; 
		while (it.hasNext()) {
			e = (Map.Entry)it.next();
			
			System.out.println("이름: " + e.getKey());
			System.out.println("점수: " + e.getValue());
			System.out.println();
		}
		
		set = studentMap.keySet();
		System.out.println("학생들 명단: " + set);
		
		
		Collection values = studentMap.values();
		
		it = values.iterator();
		
		int total = 0;
		int num = 0;
		while (it.hasNext()) {
			num = (int)it.next();
			total = total + num;
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + (double)total/set.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));
		
		
		
	}

}
