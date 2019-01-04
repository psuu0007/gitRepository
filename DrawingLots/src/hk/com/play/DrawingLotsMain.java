package hk.com.play;

import hk.com.service.DrawingLotsService;


/**
 * @author 박성욱
 * @since 2017-02-09
 * <pre>당첨뽑기 프로그램</pre>
 */
public class DrawingLotsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingLotsService dls = new DrawingLotsService();
		
		// 수강생들의 정보 생성
		dls.setMemberInfo();
		
		// 수강생들의 정보 출력
		dls.getMemberInfo();
		
		// 당첨뽑기 게임 시작
		dls.playDrawingLots();
	}

}
