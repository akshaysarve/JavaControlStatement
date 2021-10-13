package controlstatement;

import java.util.Scanner;



public class controlstatementassign {

	public static void main(String[] args) {
		
		/*================================================================================
		| Author : Akshay Sarve
		| Project: Java | Selenium
		| Purpose: This java program is used to explain about control statement
		| Date   : 12/10/2021                                                                    
		 *===============================================================================*/
		
		
		// Create Scanner class object to get input value
		Scanner scn = new Scanner(System.in);

		// take input for score
		System.out.print("Enter score value: ");
		int marks = scn.nextInt();
		
		
		// Program to validate students marks
		if(marks >= 80 && marks <=100) {
			System.out.println("Excellent: Grade O");
		}
		else if(marks >= 75 && marks <= 79){
			System.out.println("Great: Grade A");
		}
		else if (marks >= 70 && marks <= 74){
			System.out.println("Good: Grade B" );
		}
		else if (marks >=60 && marks <=69){
			System.out.println("Satisfactory: Grade C");
		}
		else if (marks >=50 && marks<=59){
			System.out.println("Satisfactory: Grade D");
		}
		else if(marks >=45 && marks<=49){
			System.out.println("Satisfactory: Grade E");
		}
		else if(marks >=40 && marks<=44){
			System.out.println("Satisfactory: Grade P");
		}
		else{
			System.out.println("Failed! Grade F");
		}


	}
}



