import kotlin.math.abs

// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/post-solution/3436511/
// 2535
class DiffElemenSumDigitSum {
	fun differenceOfSum(nums: IntArray): Int {
		val sum = nums.reduce { acc, i -> acc + i }
		val digitSum = nums.fold(0) { acc, i ->
			when (i) {
				in 10..99 -> {
					acc + ((i / 10) + (i % 10))
				}
				in 100..999 -> {
					acc + ((i / 100) + ((i % 100) / 10) + (i % 10))
				}
				in 1000..9999 -> {
					acc + ((i / 1000) + ((i % 1000) / 100) + ((i % 100) / 10) + (i % 10))
				}
				else -> acc + i
			}

			//			when (i) {
			//				in 10..99 -> {
			//					val first = i / 10
			//					val last = i % 10
			//					acc + (first + last)
			//				}
			//				in 100..999 -> {
			//					val first = i / 100
			//					val second = (i % 100) / 10
			//					val last = i % 10
			//					acc + (first + second + last)
			//				}
			//				in 1000..9999 -> {
			//					val first = i / 1000
			//					val second = (i % 1000) / 100
			//					val third = (i % 100) / 10
			//					val last = i % 10
			//					acc + (first + second + third + last)
			//				}
			//				else -> acc + i
			//			}
		}
		return abs(sum - digitSum)
	}
}