package com.exercises;

public class RootsOfQuadraticEq 
{
	public static void main(String[] args) 
{

	    // hard-coded values for a,b,c
	    double a = 7;
	    double b = 3; 
	    double c = 12;
	    // Roots
	    double r1, r2;

	    // determinant = b^2 - 4ac
	    double d = (b * b - 4 * a * c);

	    // checking if determinant > 0
	    if (d > 0) {

	      // two real and distinct roots
	      r1 = (-b + Math.sqrt(d)) / (2 * a);
	      r2 = (-b - Math.sqrt(d)) / (2 * a);

	      System.out.format("First Root r1 = %.2f and Second Root r2 = %.2f", r1, r2);
	    }

	    // checking if determinant == 0
	    else if (d == 0) {

	      // two real and equal roots
	      // determinant == 0
	      r1 = r2 = -b / (2 * a);
	      System.out.format("First Root r1 = Second Root r2 = %.2f;", r1);
	    }

	    // checking if determinant < 0
	    else {

	      // roots are complex numbers and distinct
	      double realRoot = -b / (2 * a);
	      double imaginaryRoot = Math.sqrt(-d) / (2 * a);
	      System.out.format("First Root r1 = %.2f+%.2fi", realRoot, imaginaryRoot);
	      System.out.format("\nSecond Root r2 = %.2f-%.2fi", realRoot, imaginaryRoot);
	    }
}
}
