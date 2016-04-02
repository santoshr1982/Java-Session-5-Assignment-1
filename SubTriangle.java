package Area.Triangle.Rectangle;
//This is the superclass is written to calculate the area of triangle.
public class SubTriangle extends AreaRectangle 
{
	double dTriangleArea;					//Declaration of variable.
	public void AreaTriangle(double dLength, double dBreadth)	//This is the method to calculate the area of rectangle.
	{
		
		super.AreaRectangle(dLength, dBreadth);		// Calling the rectangle formula from super class.
		dTriangleArea = dArea/2;		// This is the formula for calculating the area of triangle.
			
	}
	
}
