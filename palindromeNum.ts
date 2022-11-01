/* function isPalindrome(x: number): boolean {

const numArray = Array.from(x.toString());
  const invertArray = [...numArray].reverse();
  
  for (let i = 0; i < numArray.length; i++) {
    if (numArray[i] === invertArray[i]) continue
    else return false
  }
  return true
}; */

/* function isPalindrome(x: number): boolean {

  if (x < 0) return false; // avoids negatives
  const reverse = `${x}`.split('').reverse().join('');
  return x == parseInt(reverse);
} */


//https://leetcode.com/problems/palindrome-number/discuss/5141/JavaScript-Fast-and-Optimized


function isPalindrome(x: number): boolean {
    if (x < 0) return false;        // only positive number
    if (x < 10) return true;        // for 1-9 cases
    if (x % 10 === 0) return false; // in case of last 0 [3330, 123320, 1000, etc]
    
    let rev = 0;                    // reversed number
    while (x >= 10) {
        let cur = x % 10;
        rev = rev*10 + cur;
        if (x === rev) return true; // check before changing
        x = ~~(x / 10); // better replace for Math.floor(), bit operator '~' inverts all the bits in your number and in the process converts the number to an int
        if (x === rev) return true; // check after changing
        if (x < rev) return false;  // stop in case reversed number becomes greater than original value
    }
    return false; // the longest case (diff in the middle) // [77778777, 10004001] 

}





console.log(isPalindrome(1000021));