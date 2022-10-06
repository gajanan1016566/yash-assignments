package com.yash.oppsassignment;

import java.util.Scanner;

/*Create a class Area in which user will be asked to input the sides of shape. User will 
be asked to input three sides of shape. If user input two sides of shape same, you have 
to print area of square for that side. With 3 inputs you have to print area of rectangle 
in combination. With 3 sides you have to print the area of triangle. Also check the 
given three sides are belong to right angle triangle or not. */
public class FourthPro {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first side");
		int firstSide=sc.nextInt();
		System.out.println("Enter the second side");
		int secondSide=sc.nextInt();
		System.out.println("Enter the third side");
		int thirdSide=sc.nextInt();
		
		FourthPro f=new FourthPro();
		if(firstSide==secondSide|| secondSide==thirdSide||thirdSide==firstSide) 
		{
		    f.areaOfSquare(firstSide, thirdSide, secondSide);}
	 
		else {
		System.out.println("not the square beacase side are diff");
	  }
		
		f.areaOfRectangle(firstSide,secondSide,thirdSide);
		f.areaOfTriangle(firstSide, secondSide, thirdSide);
		
	}
	void areaOfSquare(int a,int b,int c) {
		    int area_square=a*b;
		    area_square=b*c;
		    area_square=c*a;
	        System.out.println("The area of the square is if two side is same  "+ area_square); 
	        
		
	}
	
	void areaOfRectangle(int x,int y,int z) {
		int area_Rectangle=x*y;
		System.out.println("area of the Rectangle "+area_Rectangle);
		
	}
     void areaOfTriangle(int x,int y,int z) {
    	 int areaOfTriangle = (x*y*z)/2;
    	 isValidTriangle(x,y,z);
         System.out.println("The area of the Triangle is "+ areaOfTriangle);
         if(isValidTriangle(x,y,z)) {
            System.out.println("This Traingle is valid ");
         }
         else {
        	 System.out.println("It is a not valid traingle ");
         }
	}
     public static boolean isValidTriangle(int a, int b, int c) 
     {
    	  return (a + b > c && b + c > a && c + a > b);
    	 }
     
}
