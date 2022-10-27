class Reverse{

	public static void main(String args[]){

		int n=123;
		int r=0;
		int z=0;
		
		while(n>0){

		r=n%10;
		z=z*10+r;
		n=n/10;

		}

		System.out.println(z);		
	}
}