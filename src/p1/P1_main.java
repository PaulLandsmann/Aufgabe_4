package p1;

public class P1_main {

	public static void main(String[] args) {
		
		int stockwerk = 0;
		String anzeige = "";
		
		
		
		switch (stockwerk) {
			
			case 3:
				anzeige = "Kinderbekleidung%n";
		
			case 2:
				anzeige = anzeige + "Herrenbekleidung%n";
		
			case 1:
				anzeige = anzeige + "Damenbekleidung%n";
				
			case 0:
				anzeige = anzeige + "Angebote";
				break;
			
			case -1:
				anzeige = "Parkhaus";
				break;
				
			default:
				anzeige = "unbekannt"; 
				break;
			
				
			
				
			
		}
		
		
		System.out.printf(anzeige);
		

	}

}
