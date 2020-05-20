package entities;

public class CurrencyConverter {
	
	public static double IOF = 1.06;
	
	public  static double Converter(double dollarPrice, double quantityDollars) {
		return  dollarPrice * quantityDollars * IOF;
	}
}
