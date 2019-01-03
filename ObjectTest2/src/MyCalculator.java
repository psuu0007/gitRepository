
public class MyCalculator {
	
	int add(int num, int num2) {
		return num + num2;
	}
	
	double add(double num, double num2) {
		return num + num2;
	}
	
	int subtract(int num, int num2) {
		return num - num2;
	}
	
	double subtract(double num, double num2) {
		return num - num2;
	}
	
	int multiply(int num, int num2) {
		return num * num2;
	}
	
	double multiply(double num, double num2) {
		return num * num2;
	}
	
	double divide(int num, int num2) {
		double result = 0.0;
		result = (double)num / num2;
		
		return result;
	}
	
	double divide(double num, double num2) {
		return num / num2;
	}
	
}
