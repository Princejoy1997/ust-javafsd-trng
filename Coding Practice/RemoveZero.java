
class RemoveZero{

	public static void main(String args[]){

		String s="0000001234";
		char c;
		int n=0;
		String st="";

		for(int i=0;i<s.length();i++){
				
			c=s.charAt(i);

			if(c !='0'){
				n=i;
				break;
			}
			 
		}

		st=s.substring(n,s.length());
		System.out.println(st);
			

	}
}