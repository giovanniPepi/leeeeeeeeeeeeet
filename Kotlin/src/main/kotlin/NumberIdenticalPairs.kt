// 1512 - https://leetcode.com/problems/number-of-good-pairs/description/

// The function takes an array of integers nums as input and returns the number of
// pairs of indices (i, j) such that nums[i] == nums[j] and i < j.
//
//
//  Create a HashMap called map to store the frequency of each number in the input array.
//  Iterate through the input array nums using a for loop,
//  For each number num, update its frequency in the map using the getOrDefault function.
//  Iterate through the frequency of each number in the map.
//  If a number appears n times, then n * (n – 1) / 2 good pairs can be made with this number;
//  For each frequency f, compute the number of pairs using the formula (f * (f - 1)) / 2,
//  and add it to the identicalPairs.

// the class is using a hash map to keep track of the frequency of each number in the input array.
// It then iterates over the frequency of each number to compute the number of pairs of indices that
// satisfy the given condition. This approach has a time complexity of O(n), where n is the length of
// the input array.


class NumberIdenticalPairs {
	fun numIdenticalPairs(nums: IntArray): Int {
		val map = hashMapOf<Int, Int>()
		var identicalPairs = 0
		for (num in nums) map[num] = map.getOrDefault(num, 0) + 1
		for (f in map.values) identicalPairs += f * (f - 1 ) / 2
		return identicalPairs
	}
}