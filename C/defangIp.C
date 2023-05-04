// https://leetcode.com/problems/defanging-an-ip-address/

#include <stdio.h>
#include <stdlib.h>

char *defangIPaddr(char * address){
    char *d = calloc(1, sizeof("xxx[.]xxx[.]xxx[.]xxx")), *t = d;
    for (char *a = address; *a; a++) 
        *a == '.'? *d++ = '[', *d++ = '.', *d++ = ']' : (*d++ =*a);
    return t;
}

/*
- Allocate memory for a new string called "d" using the calloc function. The size of the string is determined by the length of the string "xxx[.]xxx[.]xxx[.]xxx", which is the maximum length of a defanged IP address. The "sizeof" operator is used to calculate the size of the string literal at compile time.
- Set a pointer "t" to point to the beginning of the newly allocated memory. This is done so that we can return the pointer to the beginning of the string after it has been defanged.
- Loop through each character in the input string "address" using a pointer "a". The loop continues until it reaches the null character '\0', which marks the end of the string.
- Check if the current character pointed to by "a" is a period ('.'). If it is, replace it with the defanged version of the period ("[.]") in the new string pointed to by "d". This is done by incrementing the "d" pointer three times to add each character of the defanged period.
- If the current character is not a period, simply copy it to the new string pointed to by "d" by incrementing the "d" pointer once and assigning the current character to the new location.
- After the loop is finished, return the pointer "t", which points to the beginning of the defanged IP address string. */