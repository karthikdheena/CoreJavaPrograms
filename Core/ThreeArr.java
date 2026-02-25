package Core;

public class ThreeArr {

	public static void main(String[] args) {
		
		int arr [][][] = new int[3][4][3];
		
		for(int i = 0; i < 3;i++) {
			for(int j = 0;j < 4;j++) {
				for(int k = 0; k < 3;k++ ) {
					
					arr[i][j][k] = (int)(Math.random()*10);
				}
				
				
			}
		}
		
		for(int i = 0; i < 3;i++) {
			for(int j = 0;j < 4;j++) {
				for(int k = 0; k < 3;k++ ) {
					
					System.out.print(arr[i][j][k] + "");
					
				}
		System.out.println("");
		
	}

		}
	}
}
