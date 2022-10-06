package com.yash.oppsassignment;

import java.util.Scanner;


	
	class Circle implements Shape{
		
		@Override
		public void area(int x,int y)
	    {
	        double z = 3.14 * x * y;
	        
	           System.out.println("the area of circle  "+ z);    
	   }
		
	}
	class Triangle implements Shape{

		@Override
		public void area(int x,int y)
	    {
	        int areaOfTriangle = (x*y)/2;
	        System.out.println("The area of Triangle  "+ areaOfTriangle);
	          
	    }
		
	}
	class Square implements Shape{

		@Override
		public void area(int x,int y)
	    {
	        int area_square=x*x;
	        
	        System.out.println("the area of square  "+ area_square);    
	        
	    }
		
	}
	public class SecondPro {
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the First number");
			 int firstNumber=sc.nextInt();
			 
			
			 System.out.println("Enter the Second number : ");
		        int secondNumber=sc.nextInt();
		       
		        Circle cir = new Circle();
		        cir.area(firstNumber,firstNumber);
		        Triangle tri = new Triangle();
		        tri.area(firstNumber,secondNumber);
		        
		        Square squ = new Square();
		        squ.area(firstNumber,secondNumber);
			

		}

	}


