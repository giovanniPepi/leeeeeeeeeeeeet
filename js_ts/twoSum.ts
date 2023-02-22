// https://leetcode.com/problems/two-sum/discuss/1527009/O(n)-JavaScript-(TypeScript)-with-detailed-explanatory-comments

// using JavaScript Map

const twoSum = (nums: number[], target: number): number[] => {
  const numberMap = new Map();

  for (let i = 0; i < nums.length; i++) {
    //acess the number in each index
    const number = nums[i];
    // find the difference to reach target number
    const diff = target - number;

    // check if we have the number stored in map
    // else, store it like [number -> index]
    if (numberMap.has(diff)) return [numberMap.get(diff), i]
    numberMap.set(number, i);
    console.log(numberMap);
  }
};

console.log(twoSum([3,2,4], 6))