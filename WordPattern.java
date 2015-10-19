package excersises;

/*
 
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a
non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.

Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase 
letters separated by a single space.

 */

import java.util.*;
import java.util.AbstractMap;
public class WordPattern {
	public static void main(String [] args) {
		boolean value = wordPattern("aaa", "cat cat cat");
		//System.out.println(value);
	}
	public static boolean wordPattern(String pattern, String str) {
		ArrayList <String> makeLikeArray = new ArrayList<String> ();
		ArrayList <Integer> subPatOne = new ArrayList<Integer> ();
		ArrayList <Integer> subPatTwo = new ArrayList<Integer> ();
		
        int firstWordLength = pattern.length();
        
        char space = ' ';
        str = str.trim();
        int counter = 0;
        int index = 0;
        int f = 0;
        for (f=0; f < str.length(); f++) {
            if (space == str.charAt(f))
            {	
            	String s = str.substring(index, f);
            	s = s.trim();
            	makeLikeArray.add(s);
            	index = f;
                counter++;
            }    
        } 
        counter += 1; //getting the length of the str
      String lastStr =  str.substring(index, str.length());
      lastStr = lastStr.trim();
      
      makeLikeArray.add(lastStr);
       
        if (firstWordLength != counter) {
        	return false;
        }
        else {
        	char s = ' ';
  
        	//getting pattern for the pattern
        	for (int i = 0; i < counter; i++) {
        		s = pattern.charAt(i);
        		for (int j = 0; j < counter; j++) {
        			if ( s == pattern.charAt(j)){
        				subPatOne.add(j);
        				//System.out.print(j + " ");
        			}
        		}
        	} //end of outterloop
        	
        	//System.out.println(subPatOne);
        	
        	String toStr = "";
        	
        	for (int i = 0; i < counter; i++) {
        		toStr = makeLikeArray.get(i);
        		for (int j = 0; j < counter; j++) {
        			if (toStr.equals(makeLikeArray.get(j))){
        				
        				//System.out.println(j);
        				subPatTwo.add(j);
        				//System.out.print(j + " ");
        			}
        		}
        	} //end of outterloop
        	
//        	System.out.println(subPatOne);
//        	System.out.println(subPatTwo);
	
        }
       return subPatOne.equals(subPatTwo);
    }
}
