package com.github.loop.simplestockapp;

/**
 * @author Yogesh Nagarur
 * This class (has getters) returns the stock details of the company in question.
 */
public class StockDetails {
	
	private String name;
	private float price;
	private float oldPrice;
	private float dividend;
	private String marketCap;
	private String stockExchange;
	
	/**
	 * 
	 * @param name
	 * @param price
	 * @param oldPrice
	 * @param dividend
	 * @param marketCap
	 * @param stockExchange
	 */
	public StockDetails(String name, float price, float oldPrice,
			float dividend, String marketCap, String stockExchange) {
		this.name = name;
		this.price = price;
		this.oldPrice = oldPrice;
		this.dividend = dividend;
		this.marketCap = marketCap;
		this.stockExchange = stockExchange;
	}
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return dividend
	 */
	public float getDividend() {
		return dividend;
	}
	/**
	 * 
	 * @return price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * 
	 * @return marketCap
	 */
	public String getMarketCap() {
		return marketCap;
	}
	/**
	 * 
	 * @return oldPrice
	 */
	public float getOldPrice() {
		return oldPrice;
	}
	/**
	 * 
	 * @return stockExchange
	 */
	public String getStockExchange() {
		return stockExchange;
	}

}
