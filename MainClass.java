package Area.Triangle.Rectangle;
//This program has been written to calculate the area of a triangle and rectangle using inheritance.
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)
	{
												//Declaration of variables.
		double dlen;
		double dBre;
		int iChoice;
		Scanner sC = new Scanner(System.in);	//Initialization of input scanner.
		iChoice=0;
		
		while (iChoice < 3)						//While loop to display menu.
		{
		try										// try catch block to handle error.
		{
			System.out.println("1. Calculate the area of rectangle.");		// display menu.
			System.out.println("2. Calculate the area of triangle.");
			System.out.println("3. Exit");
			System.out.println("Please enter your choice: ");
			iChoice = sC.nextInt();												//Accept input.
			SubTriangle ST = new SubTriangle();
			
			switch(iChoice)											// Switch case.
			{
			
			
			case 1: System.out.println("Please enter the length of the rectangle: ");
					dlen = sC.nextDouble();
					System.out.println("Please enter the breadth of the rectangle: ");
					dBre = sC.nextDouble();
					ST.AreaTriangle(dlen, dBre);		
					System.out.println("The area of rectangle is " + ST.dArea + ".");
					System.out.println("");
					break;
			
			case 2: System.out.println("Please enter the height of the triangle: ");
					dlen = sC.nextDouble();
					System.out.println("Please enter the base of the triangle: ");
					dBre = sC.nextDouble();
					ST.AreaTriangle(dlen, dBre);	
					System.out.println("The area of triangle is " + ST.dTriangleArea + ".");
					System.out.println("");
					break;
					
			case 3: return;
					//break;
				
			default:System.out.println("Enter a valid number and rerun the program again.");
			 		break;
			 		
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid number between 1 to 3 and rerun the program.");
			break;
		}
		}
	}
	
}
