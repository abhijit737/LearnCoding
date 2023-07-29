import java.util.Scanner;

public class DifferentString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		
		
		String input = sc.next();
        String[] strings = input.split(",");

        String different = "";
        int count = 0;

        for (int i = 0; i < strings.length; i++) 
	{
            for (int j = i + 1; j < strings.length; j++) 
		{
                int diffCount = 0;
                String s1 = strings[i];
                String s2 = strings[j];

                if (s1.length() != s2.length()) {
                    continue;
                }

                for (int k = 0; k < s1.length(); k++) {
                    if (s1.charAt(k) != s2.charAt(k)) {
                        diffCount++;
                    }
                }

                if (diffCount == count) {
                    different = "";
                } else if (diffCount > count) {
                    count = diffCount;
                    different = s1;
                }
            }
        }

        System.out.println("The different string is: " + different);
    }
}