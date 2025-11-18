package p3;

public class P3_main {

	public static void main(String[] args) {
		
		boolean x = true;
		boolean y =true;
		
		boolean a = !(x != y && x == y);
		boolean b = x || true;
		boolean c = x && false;
		boolean d = (x && !y) || (!x);
		
		String A = Boolean.toString(a) + "%n";
		String B = Boolean.toString(b) + "%n";
		String C = Boolean.toString(c) + "%n";
		String D = Boolean.toString(d) + "%n";
		

		
		x = true;
		y = false;
		
		a = !(x != y && x == y);
		b = x || true;
		c = x && false;
		d = (x && !y) || (!x);
		
		A = A + Boolean.toString(a) + "%n";
		B = B + Boolean.toString(b) + "%n";
		C = C + Boolean.toString(c) + "%n";
		D = D + Boolean.toString(d) + "%n";
		
		
		
		x = false;
		y = true;
		
		a = !(x != y && x == y);
		b = x || true;
		c = x && false;
		d = (x && !y) || (!x);
		
		A = A + Boolean.toString(a) + "%n";
		B = B + Boolean.toString(b) + "%n";
		C = C + Boolean.toString(c) + "%n";
		D = D + Boolean.toString(d) + "%n";
		
		
		
		x = false;
		y = false;
		
		a = !(x != y && x == y);
		b = x || true;
		c = x && false;
		d = (x && !y) || (!x);
		
		A = A + Boolean.toString(a) + "%n%n%n%n";
		B = B + Boolean.toString(b) + "%n%n%n%n";
		C = C + Boolean.toString(c) + "%n%n%n%n";
		D = D + Boolean.toString(d) + "%n%n%n%n";
	
	
		
		
		System.out.printf(A);
		System.out.printf(B);
		System.out.printf(C);
		System.out.printf(D);
	
	
	
	
	
	}
}
