//https: leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/
/**
 * @param {number} num
 * @return {number}
 */
var numberOfSteps = function (num) {
    var steps = 0;
    while (num > 0) {
        num % 2 === 0 ? (num /= 2) : num--;
        steps++;
    }
    return steps;
};
// bitwise
var numberOfStepsBitwise = function (num) {
    var steps = 0;
    while (num > 0) {
        // num: xxxxxxx0 & bitmask 00000001
        if ((num & 1) === 0) {
            // shift to the right is the same as halving
            num >>= 1;
        }
        else
            num--;
        steps++;
    }
    return steps;
};
console.log(numberOfSteps(14), numberOfStepsBitwise(14));
