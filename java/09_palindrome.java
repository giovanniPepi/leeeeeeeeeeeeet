class Solution {
    public boolean isPalindrome(int x) {
        /* Convert the input to an array of characters */
        char[] numbers = String.valueOf(x).toCharArray();
        /* 2-pointers to interate through the arrays */ 
        int start = 0;
        /*Get our end position*/ 
        int end = numbers.length-1;
        /*Iterate through it*/
        while(start < end) {
            /*If any number is different, the loop breaks and return false*/
            if(numbers[start] != numbers[end]) return false;
            start ++;
            end --;
        }
    return true;
    }


}