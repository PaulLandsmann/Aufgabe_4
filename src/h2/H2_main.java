package h2;

public class H2_main {

	public static void main(String[] args) {
		
		boolean x = true;
		boolean y = true;
		int input = 1;

		
		
		if(input == 10 || input == 11) {
			x = true;
		}
		else {
			x = false;
		}
		
		
		if(input == 11 || input == 1) {
			y = true;
		}
		else {
			y = false; 
		}
		
		boolean E1 = x == true;
		boolean E2 = y == true;
		boolean E3 = x == !y;
		
		boolean a = E1 && E2;
		boolean b = E1 || E3;
		boolean c = !y;
	
	}

}
