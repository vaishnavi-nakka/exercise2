package com.stackroute;


public class PowerOf4 {
	
	public boolean checkPower(String n){
		boolean flag = false;
		double num = Double.parseDouble(n);
		while(num>=1){	
			if(num == 1){
				flag = true;
				break;
			}
			if(num % 4 != 0){
				flag = false;
				break;
			}
			else{
				flag = true;
				num = num / 4;
			}
		}
		return flag;
		
	}

	

}
