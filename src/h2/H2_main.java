package h2;

public class H2_main {
	public static void main(String[] args) {
		int  i 		= 1;
		int  j 		= 2;
		int  k 		= 3;
		int  min = 0, max = 0;	
		
		if (i < j && i < k) {
			min = i; }
		else if (j < i && j < k) {
			min = j; }
		else if (k < j && k < i) {
			min = k; }
		
		if (i > j && i > k) {
			max = i; }
		else if (j > i && j > k) {
			max = j; }
		else if (k > j && k > i) {
			max = k; }
	
	System.out.println("min =  " + min);
	System.out.println("max =  " + max);
	
	}
}
		 
	



