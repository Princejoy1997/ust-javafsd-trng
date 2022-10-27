class Arraycpy{
	public static void main(String args[]){

		int[] a={1,2,3,4,5};
		int[] b=new int[a.length];

		for(int i=0;i<a.length;i++){

			for(int j=i;j<a.length;j++){
			
				b[j]=a[i];

			
			}
		}

		for(int k=0;k<b.length;k++){

			System.out.println(b[k]);

}

		
			

	}
}