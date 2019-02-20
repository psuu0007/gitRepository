package project.test;

import project.car.Car;
import project.car.FireEngine;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		fe = car;
//		car.water();
				
		fe2 = (FireEngine)car;
		fe2.water();
			
		
		
	}

}
