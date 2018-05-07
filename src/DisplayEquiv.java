
import java.util.LinkedList;
import java.util.Scanner;

public class DisplayEquiv 
{

	 
		public static void main(String[] args) 
		{
			 Scanner scanner = new Scanner(System.in);
			   LinkedList<String> linkedList = new LinkedList<String>();
			   String type;
	
				do
			   	{   
			   		int sum =0;
			     System.out.println("enter your id");
				 String id = scanner.next();
				 
				 for(int i=0;i<id.length();i++)
			   	 {
			   		char digit = id.charAt(i);
			   		System.out.print(digit);
			   		int num = (int)digit;
			   		num = Character.getNumericValue(digit);
			   		sum = sum+num;
			   		
			   	    if(digit =='0')
			   		{
			   			System.out.print(" ");
			   			System.out.print("Zero");
			   			System.out.println();
			   			
			   		}
			   		else if(digit =='1')
			   		{
			   			System.out.print(" ");
			   			System.out.print("1");
			   			System.out.println();
			   			
			   		}
			   		else if(digit =='2')
			   		{
			   			System.out.print(" ");
			   			System.out.print("Two");
			   			System.out.println();
			   			
			   		}
			   		else if(digit =='3')
			   		{
			   			
			   			System.out.print(" ");
			   			System.out.print("333");
			   			System.out.print(" ");
			   			System.out.print(sum);
			   			System.out.println(" ");
			   			
			   			
			   		}
			   		else if(digit =='4')
			   		{
			   			System.out.print(" ");
			   			System.out.print("Four");
			   			System.out.println(" ");
			   			
			   		}
			   		else if(digit =='5')
			   		{
			   			System.out.print(" ");
			   			System.out.print("55555");
			   			System.out.println();
			   			
			   		}
			   		else if(digit =='6')
			   		{
			   			System.out.print(" ");
			   			System.out.print("six");
			   			System.out.print(" ");
			   			System.out.print(sum);
			   			System.out.println();
			   			
			   		}
			   		else if(digit =='7')
			   		{
			   			System.out.print(" ");
			   			System.out.print("7777777");
			   			System.out.println();
			   			
			   		}
			   		else if(digit =='8')
			   		{
			   			System.out.print(" ");
			   			System.out.print("Eight");
			   			System.out.println();
			   			
			   		}
			   		else if(digit =='9')
			   		{
			   			System.out.print(" ");
			   			System.out.print("999999999");
			   			System.out.print(" ");
			   			System.out.print(sum);
			   			System.out.println();
			   		
			   		}
			   		else
			   		{
			   			System.out.println("Enter an integer value. ");
			   		}
			   	 }
				   linkedList.add(id);
				   System.out.println("enter 'yes'\n if you  have another id to enter.");
				  
				    type = scanner.next();
			   }while(type.equals("yes"));
			   
			   	
			   	
			   	
			   	System.out.println("There are following ID's in the List:");
			   	for(int j=0;j<linkedList.size();j++)
			   	{
		           System.out.println((j+1)+": "+linkedList.get(j));
			   	}
		        scanner.close();
	    }
}



