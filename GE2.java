// Aric Akbani
// Guided Exercise 2
// CS 250, McQuillan

// This program tests an input from the user to see if that input is a palindrome.  This program is great for series of characters and spaces.
// However, it cannot differintiate between sentence based palindromes where word length, spaces and punctuation can change the sequence in the array.
// Example: "racecar" will give a true response, but "Never odd or even" will give a false response due to the structure of spaces


//Import the scanner utility
import java.util.Scanner;	

public class GE2
{
	public static void main(String []args)
	{
		//set up Scanner
		Scanner scan = new Scanner(System.in);
		
		//Ask the user to input a word to be checked as a palindrome and turn the input into a String
		System.out.println("Enter a word or series of characters you would like to have checked as being a palindrome.");
		System.out.print("The characters, letters and spaces are case sensitive: ");
		String response = scan.nextLine();
		
		//Testing line of scanner.
		//System.out.println(response);	
		
		//Code to take string and turn it into an array of characters goes here
		char[] charArray = response.toCharArray();
		
		/* This code was here to test if charArray is in order
		int i = 0;
		while(i < charArray.length)
		{
			System.out.println(charArray[i]);
			i++;
		}
		*/
		
		//Method to take array of characters and reverse the sequence goes here
		char[] revArray = reverseArray(charArray);
		
		
		System.out.println();
		
		/* This code is here to test if revArray is in order.  
		i = 0;
		while(i < revArray.length)
		{
			System.out.println(revArray[i]);
			i++;
		}
		*/

		//Code to compare original array to reversed array goes here
		//		If arrays characters match up method returns a True
		//		If arrays characters do not match up method returns False
		boolean charTest = true;
		for(int j = 0; j < revArray.length; j++)
		{
			if(revArray[j] != charArray[j])
			{
				charTest = false;
				break;
			}
		}
		System.out.println(charTest);
		
		//Output whether the response is a palindrome or not.
		if(charTest == false)
			System.out.println(response + " is not a palindrome!");
		else if(charTest == true)
			System.out.println(response + " is a palindrome.");
				
	}
	
	//Method to change charArray into a reversed version.  
	public static char[] reverseArray(char[] charIn)
	{
		char[] temp = new char[charIn.length];
		
		for(int i = 0; i < charIn.length; i++)
		{
			temp[charIn.length - 1 - i] = charIn[i];
			// System.out.print(temp[i] + " ");			This was here to test if the chars were being reversed. Oddly enough it gives out 0000's for some characters and I don't know why.  Yet it works.
		}
		return temp;
	}

}
		
		