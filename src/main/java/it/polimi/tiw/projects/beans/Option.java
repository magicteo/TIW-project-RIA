package it.polimi.tiw.projects.beans;

public class Option {

	private int optionID;
	private String name;
	private Boolean inSale;
	private int productID;
	


	
	public int getOptionID() {
		return optionID;
	}
	public void setOptionID(int optionID) {
		this.optionID = optionID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getInSale() {
		return inSale;
	}
	public void setInSale(Boolean inSale) {
		this.inSale = inSale;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	
}
