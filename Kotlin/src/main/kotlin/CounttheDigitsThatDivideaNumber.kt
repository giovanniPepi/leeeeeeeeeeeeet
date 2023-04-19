// 2520
// https://leetcode.com/problems/count-the-digits-that-divide-a-number/

class CounttheDigitsThatDivideaNumber {
		fun countDigits(num: Int): Int {

			var count = num
			var lastDigit: Int
			val digits = mutableListOf<Int>()
			while (count > 0){
				lastDigit = count % 10 // gets the last digit
				if (num % lastDigit == 0) digits.add(lastDigit)
				count /= 10 // subtracts the last digit
			}
			return digits.size
		}
}