/* 1.3 Design an algorithm and write code to remove the duplicate characters in 
       a string without using any additional buffer. Note: one or two additional
       variables are fine. An extra copy of the array is not.
       
    Follow up: Write the test case for this method
*/

/* what does additional buffer means? 

*/

public class RemoveDuplicates {
    public static void main(String[] args) {
        char[] s = {'a','b','c','a','2','b','f'};
        System.out.println(s);
        removeDuplicate(s);
        System.out.println(s );
    }
    
    /*
    * The main idea is: we compare every character with all the characters before it,
    * if it is not a duplicate of any preceding character, we go to the next character after it,
    * otherwise we use an integer to mark its position and later put at this position the next 
    * non-repeating character to get rid of this repeating character
    */
    public static void removeDuplicate(char[] s) {
        int len = s.length;
        int tail = 1;
        int i,j;
        // s[i] is the element to be compared with all the elements before it
        for (i=1; i<len; ++i) {
            
            // s[j] is the element before s[i]
            // tail represent a position where the first repeating character appears
            for (j=0; j<tail; ++j) {
                if (s[i]==s[j]) break; // duplicates found and the tail will be the position of the duplicate
            }
            
            /*no duplicate is found, so use the character at position i to replace 
            * the possible repeating character at position tail
            */
            if (j==tail) { 
                s[tail] = s[i];
                tail+=1; 
            }
        }
        s[tail]='\t'; //use tab to indicate the end of a string, the characters before tab are all unique
    }
    
}