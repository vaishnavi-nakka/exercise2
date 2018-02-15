package com.stackroute;

public class StudentGrade {
	
	public int minimum(String[] marks){
		int min = Integer.parseInt(marks[0]);
		for(int i=0;i<marks.length;i++){
			if(min>Integer.parseInt(marks[i]))
				min = Integer.parseInt(marks[i]);
		}
		return min;
	}
	
	public int maximum(String[] marks){
		int max = Integer.parseInt(marks[0]);
		for(int i=0;i<marks.length;i++){
			if(max<Integer.parseInt(marks[i]))
				max = Integer.parseInt(marks[i]);
		}
		return max;
	}
	
	public double average(String[] marks){
		int sum = 0;
		for(int i=0;i<marks.length;i++){
			sum += Integer.parseInt(marks[i]);
		}
		return sum/marks.length;
	}
	
	public boolean isInteger(String str){
		String pattern = "/^[0-9]+$";
		if(str.equals(pattern))
			return true;
		else
			return false;
	}
}
