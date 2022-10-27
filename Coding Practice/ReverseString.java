class ReverseString{

	public static void main(String args[]){

		String str="Prince";
		char a;

		for(int i=str.length()-1;i>=0;i--){

			a=str.charAt(i);

			System.out.println(a);
		}
	}
}