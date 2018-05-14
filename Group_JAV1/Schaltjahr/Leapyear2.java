/**
 * @author Andy Gunschl (Freitagsrunde)
 * 
 */
public class Leapyear2 {
	public static void main(String[] args) {
		int[] years = { 1900, 1905, 1952, 1956, 1960, 1964, 1968, 1972, 1976,
				1980, 1984, 1988, 1992, 1996 };
		for (int y : years) {
			System.out.println(y + " = " + isLeapYear(y));
		}

		// Zusatzaufgabe
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		int number = Integer.parseInt(System.console().readLine());
		System.out.println("Ist " + number + " ein Schaltjahr: " + isLeapYear(number));
	}

	/**
	 * Ein Jahr ist ein Schaltjahr, wenn die Jahreszahl durch 4 teilbar ist.
	 * wenn die Jahreszahl durch 4, aber nicht durch 100 teilbar ist. wenn die
	 * Jahreszahl durch 4, durch 100 und durch 400 teilbar ist.
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 == 0) {
				return true;
			} else {
				if (year % 100 == 0 && year % 400 != 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}