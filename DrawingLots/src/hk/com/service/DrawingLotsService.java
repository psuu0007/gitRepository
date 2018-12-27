package hk.com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import hk.com.dto.Member;


public class DrawingLotsService {
	// 수강생들의 정보를 가지는 변수
	ArrayList<Member> memberList = new ArrayList<Member>(); 
	//	Member member = new Member();
		
	/**
	 * <pre>학생들의 정보 생성</pre>
	 */
	public void setMemberInfo(){
		int[] number = new int[15];
		String[] name = {"김준혁", "김충현", "박강인", "박기성", "박대승"
				,"송지원", "윤승환", "이명선", "장훈일", "전생근", "정민성"
				,"정혜미", "조혜선", "최문권", "최주희"};
		
		
		for(int i=0; i < name.length; i++){
			number[i] = i+1;
		}
		
		for(int i=0; i < name.length; i++){
						
			Member member = new Member(number[i], name[i]);
			
			memberList.add(member);
		}
		
	}
	
	
	/**
	 * <pre>
	 * 	1. memberInfoCreate 수행후 작동해야 함
	 *  2. 학생들의 정보가 맞는지 확인
	 * </pre>
	 */
	public void getMemberInfo(){
		Iterator<Member> it = memberList.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @param repeatNumber - 몇 명의 당첨자를 뽑을지에 대한 값
	 */
	public void playDrawingLots(){
		
		Member member = new Member();
		int totalPlayerNumber = memberList.size();
		// 게임을 반복할 횟수
		Scanner scan = new Scanner(System.in);
		int repeatNumber = 0;
		
		// 당첨숫자
		int drawNumber = 0;
		Random rand = new Random();
		
		System.out.println("몇 명의 당첨자를 뽑을까요?");
		repeatNumber = scan.nextInt();
		
		for (int i = 0; i < repeatNumber; i++) {
			
			drawNumber = rand.nextInt(totalPlayerNumber);
			member = memberList.get(drawNumber);
			memberList.remove(drawNumber);
			totalPlayerNumber--;
			System.out.println("\n축하합니다.");
			System.out.println(member + "님이 당첨되었습니다");
			if(memberList.isEmpty()){
				System.out.println("모든 학생이 당첨되었습니다.");
				break;
			}
		}
		
		System.out.println("당첨뽑기 종료");
	}
	
}
