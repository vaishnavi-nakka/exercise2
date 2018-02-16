package main.java.com.stackroute;


import java.util.Scanner;

public class Rev {
	
	private String name = "";
	
	public Rev(String name){
		this.name = name;
	}
	
	public String reverse(){
		StringBuilder input1 = new StringBuilder();
		
		input1.append(name);
		input1 = input1.reverse();
        return input1.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String pattern = "^[a-zA-Z0-9]+$";
		if(!a.equals("") && !a.contains(" ") && a.matches(pattern)){
			Rev rev = new Rev(a); 
			String b = rev.reverse();
			if(a.equals(b)){
				System.out.println("Palindrome");
			}else{
				System.out.println("Not Palindrome");
			}
		}
		else{
			System.out.println("Invalid Input");
		}
        sc.close();
        
	}

}
