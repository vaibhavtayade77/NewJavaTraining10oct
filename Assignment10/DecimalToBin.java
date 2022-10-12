package com.vaibhav.Assignment10;

public class DecimalToBin {
	
	public static void DestoBinary(int decimal){    
	     int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	System.out.println();  
	}    
	
	
	
	public static int BinToDecimal(int binary){  
	    int decimal = 0;  
	    int n = 0;  
	    while(true){  
	      if(binary == 0){  
	        break;  
	      } else {  
	          int temp = binary%10;  
	          decimal += temp*Math.pow(2, n);  
	          binary = binary/10;  
	          n++;  
	       }  
	    }  
	    return decimal;  
	}  
	
	public static void main(String[] args) {
		
		System.out.println("The given decimal number in binery is  ");
		DecimalToBin.DestoBinary(32);
		System.out.println("The given binery number in decimal is ");
		System.out.println(DecimalToBin.BinToDecimal(1110001));
	}}

