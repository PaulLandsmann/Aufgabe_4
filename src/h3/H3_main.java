package h3;

public class H3_main {

	public static void main(String[] args) {
		
		float celsiusFloat = (float) -12.23;
		
		double fahrenheitFloat = celsiusFloat * 9/5 + 32;
		double fahrenheitDouble = celsiusFloat * 9/5 + 32;
	
		System.out.println("Die Temperatur " + celsiusFloat + "°C wir mit Float zu " + fahrenheitFloat + "°F.");
		System.out.println("Die Temperatur " + celsiusFloat + "°C wir mit Double zu " + fahrenheitDouble + "°F.");

	
	
	}

}
