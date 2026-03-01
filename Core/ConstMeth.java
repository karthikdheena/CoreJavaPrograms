package Core;

class Phone{
	
	private int price;
	private String brand;
	
	public Phone() {
		
		 price = 20;			// default constructor
		brand = "poco";
		
	}
	
	public Phone(int a , String n) {
		
		price = a;				//parametrized constructor
		brand = n;
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
		Phone sell1 = new Phone(30,"samsung");
		
		System.out.println(sell1.getPrice() + ":" + sell1.getBrand());
		
		System.out.println(sell.getPrice() + ":" + sell.getBrand() );
	

	}

}
