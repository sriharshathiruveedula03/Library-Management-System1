package duplicate;

public class Buffer
{

	public static void main(String[] args) 
	{
		
		    StringBuffer z=new StringBuffer("KLU");
		      z.append(" CSE");
		      System.out.println(z);
		      System.out.println(z.capacity());
		      System.out.println(z.charAt(2));
		      System.out.println(z.codePointAt(4));
		      
		      System.out.println(":::::::::::::::::::::::");
		      StringBuilder build=new StringBuilder("KLU");
		      build.append(" Section 9");
		      System.out.println(build);
		      System.out.println(build.capacity());
		      System.out.println(build.charAt(2));
		      System.out.println(build.charAt(5));
		  }

}
