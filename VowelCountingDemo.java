/*Name : Colin Redpath
  Date : 1-21-17
  Class: CSC-251
*/

/* This Program will prompt the user to enter a word or phrase and then return how many Vowels and Constonants are included */

//import JOptionPane for the compiler 
import javax.swing.JOptionPane;

public class VowelCountingDemo
{
	public static void main(String[] args)
	{
		//Display intro message
		JOptionPane.showMessageDialog(null,"Welcome. This program will prompt you to enter a word or phrase and then display the number of Vowels and Consonants of your input. Press OK to proceed."); 
		
		//Get input from user
		String phrase = JOptionPane.showInputDialog("Enter a word or phrase.");
		
		//create a new object from the VowelCounting Class assigning the class field to the user input
		VowelCounting VowelCounter = new VowelCounting(phrase);
		
		//Display number of Vowels
		JOptionPane.showMessageDialog(null,"Your input has " + VowelCounter.getVowels() + " Vowels." );
		
		//Display number of Consonants 
		JOptionPane.showMessageDialog(null,"Your input has " + VowelCounter.getConsonants()
		+ " Consonants");
		
		//Display the option to run the program again or exit
		int choice = JOptionPane.showConfirmDialog(null,"Would you like to try again?", "choose one", JOptionPane.YES_NO_OPTION);
		
		//Repeat the program based on the Users choice 
		while(choice == JOptionPane.YES_OPTION)
		{
			
		phrase = JOptionPane.showInputDialog("Enter a word or phrase.");
		
		VowelCounter = new VowelCounting(phrase);
		
		JOptionPane.showMessageDialog(null,"Your input has " + VowelCounter.getVowels() + " Vowels." );
		
		JOptionPane.showMessageDialog(null,"Your input has " + VowelCounter.getConsonants()
		+ " Consonants");
		
		choice = JOptionPane.showConfirmDialog(null,"Would you like to try again?", "choose one", JOptionPane.YES_NO_OPTION);
		
		}
		
		//Exit the program if the User chooses to
		if(choice == JOptionPane.NO_OPTION)
		{
			System.exit(0);
		}
		
	}

	
}