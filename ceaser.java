package cipher;

import java.util.*;

public class ceaser {

	public static void main(String[] args) {
		String plainText = "";
		int shift = 0;
		String direction = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your plaintext:");
		plainText = input.next();
		System.out.println("Enter your shift:");
		shift = input.nextInt();
		System.out.println("Enter your direction");
		direction = input.next();
		String result = "";
		if(direction.equals("right"))
		{
			for(int i = 0; i < plainText.length(); i++)
			{
				int ASCII = (int)plainText.charAt(i);
				if(ASCII>97)
				{
					ASCII+=shift;
					if(ASCII>122)
					{
						ASCII%=122;
						ASCII+=97;
					}
				}
				
				
				else if(ASCII>65)
				{	ASCII+=shift;
					
					if(ASCII>90)
					{
						ASCII%=90;
						ASCII+=65;
					}
				}
				
				result+=(char)ASCII;
			}
		}
		
		else if(direction.equals("left"))
		{
			for(int i = 0; i < plainText.length();i++)
			{
				int ASCII = (int)plainText.charAt(i);
				ASCII-=shift;
				
				if(ASCII<97 && ASCII>90)
				{
					ASCII=122;
					ASCII-=shift;
				}
				
			
				
				if(ASCII<65)
				{
					ASCII=90;
					ASCII-=shift;
				}
				result+=(char)ASCII;
			}
		}
		
		System.out.println(result);
	}

}
