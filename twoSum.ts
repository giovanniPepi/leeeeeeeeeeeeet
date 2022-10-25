// https://leetcode.com/problems/two-sum/discuss/1527009/O(n)-JavaScript-(TypeScript)-with-detailed-explanatory-comments

const twoSum = (nums: number[], target: number): number[] => {
  const resultArray: number[] = [];

  const numberMap = new Map();

  for (let i = 0; i < nums.length; i++) {
    const number = nums[i];
    const diff = target - number;

    if (numberMap.has(diff)) return [numberMap.get(diff), i]
    numberMap.set(number, i);
  }
};