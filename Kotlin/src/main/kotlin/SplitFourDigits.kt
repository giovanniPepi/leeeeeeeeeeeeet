class SplitFourDigits {
	fun minimumSum(num: Int): Int {
		val digitsArray = IntArray(4)

		var n = num
		var i = 0
		while (n > 0) {
			//When we divide a number by 10, the quotient represents the number obtained by
			// removing the units place digit, and the remainder represents the digit in the units place
			// In each iteration of the loop, the remainder of n divided by 10 is computed
			// using the modulo operator %, which gives the last digit of n.
			digitsArray[i] = n % 10
			i++
			// dividing it by 10, effectively removing the last digit that was just extracted
			n /= 10
		}
		digitsArray.sort()

		// the most optimal way to obtain the minimum possible sum using 4 digits is by summing up
		// two 2-digit numbers. After sorting, the two smallest are the first two digits, so we
		// pair them with the 3rd and 4th numbers

		// Similarly, we use the final 2 larger digits as the digits found in the ones place.
		return digitsArray[0]*10 + digitsArray[2] + digitsArray[1]*10 + digitsArray[3]
	}
}


