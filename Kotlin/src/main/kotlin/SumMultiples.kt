// 2652 https://leetcode.com/problems/sum-multiples/
class SumMultiples {
	fun sumOfMultiples(n: Int): Int {
		val range = IntArray(n){it + 1}
		val sum = range.fold(0) { acc, i ->
			if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				acc + i
			} else {
				acc
			}
		}
		return sum
	}
}