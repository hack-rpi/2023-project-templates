// Let's start!
// In Java, our code is contained within methods within a class
// In our case, we want our code to be in the main method
// As an example, we have
/*

public class LearnJava
{
	public static void main(String[] args)
	{

	}
}

*/

// In this code snippet, our class is called LearnJava and has a main method that we will put our code in
// Let's put this into action!
// Firstly, we will import the Scanner class that will handle our input and output
import java.util.Scanner;

public class LearnJava
{
	public static void main(String[] args)
	{
		// In order to produce output, we will use the "print" statement
		System.out.println("Hello World!");

		// Let's say we want to store values and use them
		// We will use variables (there are a variety to choose from)
		// The most basic variable types include: int, double, String, and boolean
		// As a run-down, int represents integers
		// double represents decimal numbers
		// String represents words
		// boolean represents true/false
		// Here it is in action:
		String word = "Hello";
		int number = 5;
		boolean value = true;

		// We are declaring a name for these variable types to the left of the equal sign
		// and then setting a value for the variable to the right of the equal sign

		// Now that you're introduced to these fundamental concepts, let's look into input
		// This creates a Scanner object that allows for input
		// We imported the Scanner class at the top that allows for this statement to be valid
		Scanner scanner = new Scanner(System.in);
		// After prompting the use for an initial input...
		System.out.println("Enter your name:");
		// We will use the scanner object we created to store the user input into a String variable
		String input = scanner.nextLine();

		// Let's take a quick look at some conditionals, and we'll get you on a task!
		// Suppose you want to determine whether something is satisfied, for example,
		// you are writing a program that wants to know whether the user likes bagels!
		// In this case, we need an if-else statement
		// This is the basic format:
		boolean likesBagels = true;
		if(likesBagels == true)
		{
			System.out.println("You are a champion!");
		}
		else if(likesBagels == false)
		{
			System.out.println("What foods do you like?");
		}
		// Inside the parenthesis, we have the condition
		// If it is true, we go inside and execute whatever is inside the curly braces

		// Now that you know the basics of input, output, variable manipulation, etc...
		// Here's a task:
		// Prompt the user for the university that they attend
		// If they attend RPI (Rensselaer Polytechnic Institute), output "Woohoo!"
		// Otherwise, do nothing!
		// Bonus: continually prompt the user and change the question to something
		// different each time (hint: use a loop!)

		/*
		Your code goes here
		*/
	}
}