//https: leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/

/**
 * @param {number} num
 * @return {number}
 */

const numberOfSteps = (num: number) => {
  let steps: number = 0;

  while (num > 0) {
    num % 2 === 0 ? (num /= 2) : num--;
    steps++;
  }
  return steps;
};

// bitwise
const numberOfStepsBitwise = (num: number) => {
  let steps: number = 0;

  while (num > 0) {
    // num: xxxxxxx0 & bitmask 00000001
    if ((num & 1) === 0) {
      // shift to the right is the same as halving
      num >>= 1;
    } else num--;
    steps++;
  }
  return steps;
};

console.log(numberOfSteps(14), numberOfStepsBitwise(14));
