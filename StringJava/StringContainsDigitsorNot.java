
//not working


import java.util.regex.Matcher;
import java.util.regex.Pattern;


class StringContainsDigitsorNot
{

	String str = "12345";
	Pattern pattern = Pattern.compile("\\d+");
	Matcher matcher = pattern.matcher(str);
	if (matcher.matches) 
	{
		System.out.println("The string contains only digits.");
	}
	else 
	{
	    System.out.println("The string contains non-digit characters.");
	}
}
