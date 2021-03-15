package entities;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double valorFinal(double total) {
		return total * IOF;
	}

}
