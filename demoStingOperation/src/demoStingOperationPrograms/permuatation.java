package demoStingOperationPrograms;

import java.util.Set;
import java.util.TreeSet;

public class permuatation
{
	static TreeSet<String> str = new TreeSet<String>();
    // Utility function to swap two characters in a character array
    private static void swap(char[] ch, int i, int j)
    {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
 
    // Recursive function to generate all permutations of a String
    private static void permutations(char[] ch, int currentIndex)
    {
    	
        if (currentIndex == ch.length - 1) {
        	str.add(String.valueOf(ch));
            
        }
 
        for (int i = currentIndex; i < ch.length; i++)
        {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }
 
    // generate all permutations of a String in Java
    public static void main(String[] args)
    {
        String s = "513";
        permutations(s.toCharArray(), 0);
        System.out.println(str.first());
    }
}
