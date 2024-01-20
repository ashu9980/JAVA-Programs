package New_Project;

import java.util.LinkedHashSet;

public class Remove_Duplicate_String {
	   
	 
	    static void removeDuplicates(String str)   
	    {     
	        LinkedHashSet<Character> set = new LinkedHashSet<>();   
	        for(int i=0;i<str.length();i++)   
	            set.add(str.charAt(i));   
	        for(Character ch : set)   
	            System.out.print(ch);   
	    }   
	    public static void main(String args[])   
	    {   
	        String str = "javaTpoint is the best learning website";   
	        removeDuplicates(str);   
	    }   
	

}
