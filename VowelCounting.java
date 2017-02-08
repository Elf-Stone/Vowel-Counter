/*Name : Colin Redpath
  Date : 1-21-17
  Class: CSC-251
*/
  
//This class can be used to count Vowels & Consonants 
public class VowelCounting
{
	
	private String str;
	
	//Constructor assigning the str Field to the str1 argument
	public VowelCounting(String str1)
	{
		str = str1;
	}
	
	//Method returning the number of vowels in the str field
	public int getVowels()
	{
		String vowels = "aeiouAEIOU";
		int vowelCount = 0;
		int i;
		
		for(i = 0; i < str.length(); i++)
		{
			char currentChar = str.charAt(i);
			if (vowels.indexOf(currentChar) >= 0)
				vowelCount++;
		}
		
		return vowelCount;
	
	}
	
	
	public int getConsonants()
	{
		String vowels = "aeiouAEIOU";
		int consCount = 0;
		int i;
		
		for(i = 0; i < str.length(); i++)
		{
			char currentChar = str.charAt(i);
			if(Character.isLetter(currentChar))
				if (vowels.indexOf(currentChar) < 0)
					consCount++;
		}
		
		return consCount;
	}

}
