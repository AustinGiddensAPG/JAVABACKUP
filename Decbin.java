class DecBin{
	public static void main (string a[]){
	
	int n;
	String bin; String hex;
	for (n = 0; n <= 17; n ++){
			 bin = Integer.toBinaryString(n);
			 System.out.print(bin);
			 System.out.print(" ");
			 System.out.print(hex);
			 System.out.println();
		}
	
	}
}

