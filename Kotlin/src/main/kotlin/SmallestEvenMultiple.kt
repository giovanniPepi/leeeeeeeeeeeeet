// 2413 Smallest Even Multiple https://leetcode.com/problems/smallest-even-multiple/


// A guaranteed way to find a multiple of 2 and n is to multiply them together.
// The function first initializes a variable smallest to 0. Then it loops from 1 to 150
// using the range operator 1..150. Within the loop, it calculates the variable
// multiplication as 2 times the loop index i. If multiplication is divisible by n with
// no remainder (i.e., multiplication % n == 0), then the function sets smallest to
// multiplication and breaks out of the loop. If multiplication is not divisible by n,
// the loop continues to the next iteration.

class SmallestEvenMultiple {
	fun smallestEvenMultiple(n: Int): Int {
		var smallest = 0
		for (i in 1..150) {
			val multiplication = 2 * i
			if (multiplication % n == 0) {
				smallest = multiplication
				break
			} else continue
		}
		return smallest
	}
}
