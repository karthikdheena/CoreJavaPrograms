package Core;

class Phone{
	
	private int price;
	private String brand;
	
	public Phone() {
		
		 price = 20;//constructor
		brand = "poco";
		
	}
	
	public int getPrice() {
		
		return price;
	}
	public void setPrice(int price) {
		
		this.price = price;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}

public class ConstMeth {

	public static void main(String[] args) {
		
		Phone sell = new Phone();
		
		System.out.println(sell.getPrice() + ":" + sell.getBrand() );
	

	}

}
