/*   
    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.
 */


const romanToInt = (s: string): number => {
  const hashMap = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000
  };  
  
  console.log('received: ', s);
  let answer = 0, current = 0, previous = 0;
  let j = s.length - 1;

  // hash the string from right to left
  // doing this allows us to subtract I, X, C on the left

  for (; j >= 0; j -= 1) {
    current = hashMap[s[j]];
    console.log('current', current);
    // only when the value to the left is lower (I, X, C) we can subtract; else add
    current < previous ? answer -= current : answer += current
    console.log('current: ', current, 'previous: ', previous, "answer: ", answer);
    previous = current;
  }
  console.log(answer);
  return answer;
}

//console.log(romanToInt('LVIII')); // 58
// console.log(romanToInt('III')); // 3
console.log(romanToInt("MCMXCIV")) // 1994

