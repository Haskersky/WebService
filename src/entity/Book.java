package entity;

import java.io.Serializable;

/**
 * @author SHIKAI-PC
 *
 */
public class Book implements Serializable {
	
	private String name; 
	
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	} 
	

}
