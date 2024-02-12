package duplicate;
public class pen 
{
	public static void main(String[] args)
	{
		
		    String s1="siddu rajesh", s2="", s3=" CSE ";
		    
		    System.out.println("Index of Character 'a' in string: "+s1.indexOf('a'));
		    
		    System.out.println("Last Index of Character 's' in string: "+s1.lastIndexOf('s'));
		    
		    System.out.println("Returns 'true' if string is empty: "+s2.isEmpty());
		    
		    
		    System.out.println("\nReturns substring of string starting from index 6: "+s1.substring(6));
		    
		    System.out.println("Joints 2 strings: "+s1.concat(s3));
		    
		    System.out.println("Replaces 2 characters: "+s3.replace('C', 'Q'));
		    
		    System.out.println("Removes Spaces in a string: "+s3.trim());
		    
		    System.out.println("Changes lower to upper cases: "+s1.toUpperCase());
		    
		    System.out.println("Changes upper to lower cases: "+s3.toLowerCase());
		    
	}

}
