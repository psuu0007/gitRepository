
public class Gugudan {

	void gugudanColumn() {

		for (int i = 2; i <= 9; i++) {

			System.out.println();
			for (int n = 1; n <= 9; n++) {

				System.out.print(i + " * " + n + " = " + (i * n) + "\t");

			}

		}
	}

	void gugudanRow() {

		for (int i = 1; i <= 9; i++) {

			System.out.println();

			for (int n = 2; n <= 9; n++) {

				System.out.print(n + " * " + i + " = " + (i * n) + "\t");

			}
		}
	}
}
