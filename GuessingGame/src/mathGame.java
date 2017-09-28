//Ivy Guan
//Guessing Game

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class mathGame {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		/*System.out.println("What is your name?");
		String name = input.next();
		//int x = input.nextInt();
		System.out.println("Nice to meet you, " + name + "!");
		
		
		System.out.println("How old are you?");
		int x = input.nextInt();
		if(x == 17)
			System.out.println("Wow, we are the same age!");
		else if(x > 17)
			System.out.println("Sorry, you're older.");
		else if(x < 17)
			System.out.println("Haha, I'm older.");
		*/
		int answer = (int)Math.random()*10 + 1;
		System.out.println("Please guess a number from 1 to 10.");
		int guess = input.nextInt();
		while(guess != answer)
		{
			boolean isNumber = false;
			while(!isNumber)
			{
				try
				{
					System.out.println("Enter your guess.");
					guess = input.nextInt();
					if(guess == answer)
					{
						isNumber = true;
						System.out.println("Hurray, you guessed the right number! It is " + answer + ".");
					}
					else
						isNumber = false;
						System.out.println("Continue guessing. Your answer, " + guess + " is wrong.");
				}
				catch(InputMismatchException e)
				{
					System.out.println("That was an error type;" + e);
				}
			}
		}
	}
}
