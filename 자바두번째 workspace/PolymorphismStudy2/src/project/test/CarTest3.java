package project.test;

import project.car.Car;
import project.car.FireEngine;

public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		Car car = new Car();
		
		if(fe instanceof FireEngine) {
			System.out.println("이것은 FireEngine 객체다");
		}
		
		if(fe instanceof Car) {
			System.out.println("이것은 Car Instance다");
		}
		
		if(fe instanceof Object) {
			System.out.println("이것은 Object 객체다");
		}

//		if(fe instanceof Ambulance) {
//			System.out.println("이것은 Object 객체다");
//		}
		
//		FireEngine fe2 = fe;
//		Car c = fe;
//		Object o = fe;
//		Ambulance al = (Ambulance)fe;
		
		if(car instanceof FireEngine) {
			System.out.println("이것은 FireEngine 객체다");
		}
		
		if(car instanceof Car) {
			System.out.println("이것은 Car Instance다");
		}
		
		if(car instanceof Object) {
			System.out.println("이것은 Object 객체다");
		}
		
		
		
		
	}

}
