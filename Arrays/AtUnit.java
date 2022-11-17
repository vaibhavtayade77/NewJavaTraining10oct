package com.yash.Arrays;

public class AtUnit {
	
//	 WAP to sort array on the basis of unit place. For example we are having 
//	 following numbers:- 10,2,3,41,12,13,19,81,9. 
//	 Output will be 10,41,81,2,12,3,13,19,9.
	
	public static void main(String[] args) {
		int aa[]= {10,2,3,41,12,13,19,81,9};
		for(int i=0;i<aa.length;i++) {
			for(int j=i+1;j<aa.length;j++) {
				
				if((aa[i] % 10)>aa[j] % 10) {
					int temp=aa[i];
					aa[i]=aa[j];
					aa[j]=temp;
					
				}
			}
			System.out.print(aa[i]+"  ");
		}
	}

}
