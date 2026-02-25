package Core;

import java.util.Arrays;

public class CoreArr {

	public static void main(String[] args) {
		int num [] = {3,4,5,6};
		num [3] = 7;
		
		//int num [] = new int[4];
		//num[0] = 11;
		//num[1] = 23;			//Array
		//num[2] = 75;
		//num[3] = 87;
		
		for(int i = 0; i < num.length; i++) {
		//	for(int j = 0;j < num[i]; j++){
				
				System.out.print(num[i]+" ");
				
		//	}
		}
		
		//for(int i = 0; i <=3; i++) {
			
			System.out.println(Arrays.toString(num));
		//}
		

			
		
	}
	//@Override
	//public String  toString(String s) {
		//return "";
	}


