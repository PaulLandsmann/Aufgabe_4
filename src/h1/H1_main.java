package h1;

public class H1_main {

	public static void main(String[] args) {
		
		int zone = 1;
		double price = 0;

		switch (zone){
			case 6:
			price = 4;
			break;
			
			case 5:
			price = 3.55;
			break;
			
			case 4, 3:
			price = 2.85;
			break;
			
			case 2:
			price = 2.35;
			break;
			
			case 1:
			price = 2;
			break;
			
			default:
			price = 0;
			System.out.println("Fehler Zone existiert nicht");
		}
		
		
		if(zone >= 1 && zone <= 6) System.out.println("Die Fahrt durch die Zone " + zone + " kostet " + price + "€.");
		
		
		
		
	}

}
