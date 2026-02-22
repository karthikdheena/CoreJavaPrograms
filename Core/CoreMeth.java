package Core;

public class CoreMeth {
	
	public void playmusic() {
		
		System.out.println("Music PLaying...");
	}
	
	public String getmepen(int cost) {
		
		if(cost >=10 ) {
		return "pen";			// Methods
		}
		else {
			return "Nothing";
		}
	}

	public static void main(String[] args) {
		
		CoreMeth obj = new CoreMeth();
		obj.playmusic();
		String str = obj.getmepen(10);
		System.out.println(str);
		
	

	}

}
