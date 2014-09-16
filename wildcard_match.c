/*
字符串匹配问题，给定一串字符串，按照指定规则对其进行匹配，并将匹配的结果保存至output数组中，多个匹配项用空格间隔，最后一个不需要空格。

要求：

匹配规则中包含通配符?和*，其中?表示匹配任意一个字符，*表示匹配任意多个（>=0）字符。
匹配规则要求匹配最大的字符子串，例如a*d,匹配abbdd而非abbd,即最大匹配子串。
匹配后的输入串不再进行匹配，从当前匹配后的字符串重新匹配其他字符串。
请实现函数：

  char* my_find(char input[], char rule[])
举例说明：

input:  abcadefg
rule:   a?c
output: abc

input:  newsadfanewfdadsf
rule:   new
output: new new

input:  breakfastfood
fule:   f*d
output: fastfood

注意事项：
1. 自行实现函数my_find，勿在my_find函数里夹杂输出，且不准用C、C++库，和Java的String对象；
2. 请注意代码的时间，空间复杂度，及可读性，简洁性；
3. input=aaa，rule=aa时，返回一个结果aa，即可。

*/

#include<stdio.h>
#include <stdlib.h>     /* malloc, free, rand */


int str_len(char * a) {
    if (*a==0) {
        return 0;
    }
    
    int len=0;
    while (*a != '\0' ) {
        ++len;
    }
    return len;
}

// copy len characters from the source to the target
void str_copy(char * target, char * source, int len) {
    for( ; len>0; --len, ++target, ++source) {
        *target = *source;
    }
    *target = 0;
}


// concatenate two strings with space in between
char* str_join(char *a, char *b) {
    int lenb = str_len(b);
    int lena = str_len(a);
    int len = lena + lenb + 1; // one extra for the space ' ' 
    
    char *t = (char *) malloc(sizeof(char)*len);
    
    str_copy(t, a, lena);

    t[lena] = ' ';
    // append b to the end of a
    str_copy(&t[lena+1], b, lenb);
    return t;
}


int main() {
    // test str_join
    char a[] = "who are you?";
    char b[] = "hello";
    char *ab = str_join(a, b);
    
    printf("the original strings are: %s\n  %s\n", a, b);
    printf("The string after concatenation is: %s \n", ab);
}