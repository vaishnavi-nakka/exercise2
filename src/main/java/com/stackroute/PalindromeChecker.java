package main.java.com.stackroute;



public class PalindromeChecker {
	public boolean palindromecheck(String name){
		StringBuilder input1 = new StringBuilder();
		
		String pattern = "^[a-zA-Z0-9]+$";
		if(!name.equals("") && !name.contains(" ") && name.matches(pattern)){
		input1.append(name);
		input1 = input1.reverse();
        String inp = input1.toString();
        if(inp.equals(name)){
        	return true;
        }
        else{
        	return false;
        }
		}else{
			return false;
		}
	}
}
