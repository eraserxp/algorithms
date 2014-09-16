/*假设这有两个分别由字母组成的字符串A另外字符串B，字符串B的字母数较字符串A少一些。
  什么方法能最快地查出字符串B所有字母是不是都在字符串A里？
  也就是说判断字符串B是不是字符串A的真子集（为了简化，姑且认为两个集合都不是空集，即字符串都不为空。）。
  为了简单起见，我们规定输入的字符串只包含大写英文字母。

* 实现函数bool compare(string &A,string &B)

* 比如，如果是下面两个字符串：

* String 1: ABCDEFGHLMNOPQRS

* String 2: DCGSRQPO

* 答案是true，即String2里的字母在String1里也都有，或者说String2是String1的真子集。

* 如果是下面两个字符串：

* String 1: ABCDEFGHLMNOPQRS

* String 2: DCGSRQPZ

* 答案是false，因为字符串String2里的Z字母不在字符串String1里。

*/


/* The most straightforward method is to iterate over every character in string B and 
*  see whether it is contained in string A
*/


/* the best way is to use a character (usually 4 bytes --- 32 bits) to represent the 
   signature of a string. We only need 26 bits out of the 32 bits. If the digit on
   the rightmost bit is 1, it means the string contains A, and 0 otherwise

*/

#include <stdio.h>

int compare(char * A, char * B) {
    int signature = 0;
    while (*A !='\0') {
        signature |= (1 << (*A - 'A'));
        ++A;
    }
    
    while (*B !='\0') {
        if ( signature & (1<< (*B - 'A')) == 0 )
            return 0;
        
        ++B;
    }
    
    return 1;
}

int main() {
    char a1[] = "ABCDEFGHLMNOPQRS";
    char b1[] = "DCGSRQPO";
    
    char a2[] = "ABCDEFGHLMNOPQRS";
    char b2[] = "DCGSRQPZ";
    
    if (compare(a1, b1)) {
        printf("%s contains %s\n", a1, b1);
    }
    
    if (compare(a2, b2)) {
        printf("%s doesn't contain %s\n", a2, b2);
    }
    
    return 0;
}