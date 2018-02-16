package main.java.com.stackroute;

public class LongFactorial {
	
	
	public String factorial(String str){
		if(isInteger(str)){
			int num = Integer.parseInt(str); 
			long fact = 1;
			for(long i = num;i > 0;i--){
				if(fact*num > fact)
			       fact *= i;
				else
					return "Out of Range";
			}
			return Long.toString(fact);
		}
		else
			return "Invalid Input:No Fractions Allowed";
		
	}

	public static boolean isInteger(String s) {
	      boolean isValidInteger = false;
	      try
	      {
	         Integer.parseInt(s);
	 
	         isValidInteger = true;
	      }
	      catch (NumberFormatException ex)
	      {
	         
	      }
	 
	      return isValidInteger;
	   }

}
