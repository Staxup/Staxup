import java.util.*;
	public class palindrome 
	{
	   public static void main(String[] args) 
	   { 
	      String strInput, strReverse = "";
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Please enter the string : ");
	      strInput = sc.nextLine();
	      int num = strInput.length();
	      for(int a = num - 1; a >= 0; a--)
	      {
	          strReverse = strReverse + strInput.charAt(a);
	      }
	      if(strInput.equalsIgnoreCase(strReverse))
	      {
	         System.out.println("String is palindrome.");
	      }
	      else
	      {
	         System.out.println("String is not palindrome.");
	      }
	      sc.close();
	   }
	}

