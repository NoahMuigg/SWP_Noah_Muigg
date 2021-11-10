
public class test {
	
	public static void main(String[] args) {
		
		long zeit;
		
		zeit  = System.nanoTime();
		double SummeRekursiv = summeRekursiv(20);
		zeit = System.nanoTime() - zeit;
		System.out.println("Summe Rekursiv Ergebnis:" + SummeRekursiv);
		System.out.println(" Zeit: " + zeit + " ns \n");
		
		zeit  = System.nanoTime();
		double SummeEndRekursiv = summeEndRekursiv(20);
		zeit = System.nanoTime() - zeit;
		System.out.println("Summe Endrekursiv Ergebnis:" + SummeEndRekursiv);
		System.out.println(" Zeit: " + zeit + " ns \n");
		
		
		zeit  = System.nanoTime();
		double PotenzRekursiv = potenzRekursiv(6, 3);
		zeit = System.nanoTime() - zeit;
		System.out.println("Potenz Rekursiv Ergebnis: " + PotenzRekursiv);
		System.out.println(" Zeit: " + zeit + " ns \n");
		
		zeit  = System.nanoTime();
		double PotenzEndRekursiv = potenzEndRekursiv(6, 3);
		zeit = System.nanoTime() - zeit;
		System.out.println("Potenz Endrekursiv Ergebnis: " + PotenzEndRekursiv);
		System.out.println(" Zeit: " + zeit + " ns");

	}
	
	 
	 
	 
	 public static double potenzEndRekursiv(int basis, int exponent) {
		   return addpot(basis, exponent, 1);
	 }
	 
	 
	 public static double addpot(int basis, int exponent, int m) {
		 if (exponent==0) {
		     return m;
		   }  
		     return addpot(basis, exponent-1, basis * m); 	
		 }
		 
	 
	 public static double potenzRekursiv(long zahl, long pot) {
		 if (pot == 1) {
			return zahl;
		 } else {
			return zahl * potenzRekursiv(zahl, pot - 1);
		 	}
	 }
		 
	 
	 
	 
	 
	 
	 public static double summeRekursiv(int zahl) {
		 if (zahl <= 1) {
			 return 1;
		 }
		    return zahl + summeRekursiv(zahl - 1);
	 }
	 
	 public static double summeEndRekursiv(int n) {
		   return addsum (0, n);
		 }
	 
	 public static double addsum(int m, int n) {
		   if (n==0) {
		     return m;
		   }
		     return addsum (m+n, n-1); 	
		 }

}
