package com.yash.Arrays;

public class hcfAndlcm {
	
//	WAP to find the LCM and HCF of array numbers.
	
	public static void main(String[] args) {
		
		int a[]= {60,70,80};
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				int temp;
				int temp1=a[i];
				int temp2=a[j];
				
				while(temp2 !=0) {
					temp=temp2;
					temp2=temp1%temp2;
					temp1=temp;
				}
				int hcf=temp1;
				int lcm=(a[i]*a[j]/hcf);
				System.out.println("the hcf of given numbers is "+a[i]+" and "+a[j]+ "="+hcf);
				System.out.println("the lcm of given numbers is "+a[i]+" and "+a[j]+" = "+lcm);
			}
		}
	}
	
}
	


