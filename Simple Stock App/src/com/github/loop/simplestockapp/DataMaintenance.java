package com.github.loop.simplestockapp;

import java.text.DecimalFormat;

	/**
	 * @author Yogesh Nagarur
	 *
	 * General number maintenance such as rounding to 2 decimal places and other data checking.
	 */
public class DataMaintenance {
	/**
	 * @param numberToBeRounded
	 * @return roundedNumber
	 * 
	 * Rounds double to the the nearest 2 decimal places.
	 */
	public double roundTwoDecimals(double numberToBeRounded) {
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		Double roundedNumber = Double.valueOf(twoDForm.format(numberToBeRounded));
		return roundedNumber;
	}

	/**
	 * @param stockExchange
	 * @return Currency string
	 * 
	 * Method uses if-statements to check what currency the stock exchange 
	 * is by checking which stock exchange the trading is taking place in.
	 */
	public String checkCurrency(String stockExchange) {
		if (stockExchange.equals("Paris") || stockExchange.equals("Brussles")) {
			return ("EUR");
		}
		if (stockExchange.equals("NasdaqNM") || stockExchange.equals("NYSE")) {
			return ("$");
		}
		if (stockExchange.equals("HKSE")) {
			return ("HK$");
		}
		if (stockExchange.equals("London")) {
			return ("p(ence)");
		}
		if (stockExchange.equals("SES")) {
			return ("S$");
		} else
			return ("");
	}
}
