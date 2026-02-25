package Core;

class Mobile{
		
		String name;
		int price;
		static String brand;//ststic Variable
		
		public void show() {
			
			System.out.println(name + ":" + price + ":" + brand);
		}	
		
	}
	public class StatMeth {

		public static void main(String[] args) {
			
			Mobile obj = new Mobile();
			obj.brand = "samsung";
			obj.price = 100;
			obj.name = "phone";
			
			obj.brand = "poco";
			
			obj.show();
			
			
}
	}
