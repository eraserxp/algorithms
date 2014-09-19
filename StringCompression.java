/*
 * implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become
 * a2b1c5a3. If the "compressed" string would not become smaller than the
 * original string, you method should return the original string. You 
 * can assume the string has only upper and lower case letters (A-z)
 * 
 */ 
 
import java.util.*;

public class StringCompression {
	
	private class CharNode {
		char ch;
		int occurence;
	}	
	
	public static CharNode newCharNode(ch, occurence) {
		CharNode node = new CharNode();
		node.ch = ch;
		node.occurence = occurence;
		return node;
	}	
		
	public static String compress(String s) {
		LinkedList<CharNode> charList = new LinkedList<CharNode>();
		for (char c: s) {
			if (charList==null) {
				charList.add(newCharNode(c, 1));
			} else {
				if (charList.getLast().ch == c) {
					charList.getLast().occurence +=1;
				} else {
					charList.add(newCharNode(c, 1));
				}		
			}		
		}
		
		char[] compressedArray = new char[2*charList.size()];
		
		// iterate over the linked list
		for (CharNode node: charList) {
			
		}		
	}
	

	
	public static void main(String[] args) {
		
	}	
}	
