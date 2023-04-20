// 1281. Subtract the Product and Sum of Digits of an Integer
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

// First method uses the built-in language methods
class SubtractProductAndSum {
	fun subtractProductAndSum(n: Int): Int {
		val arrayNumbers = n.toString().map{it.toString().toInt()}.toIntArray()
		val product = arrayNumbers.reduce {acc, i -> acc * i}
		val sum = arrayNumbers.reduce {acc, i -> acc + i}
		return product - sum
	}

	// this method uses more math and less memory
	fun efficientlySubtractProductAndSum(n:Int): Int {
		var num = n
		var sum = 0
		var product = 1

		while(num!=0){
			val currentDigit = num % 10 // the remainder is the last digit
			num /= 10 // update the number for the next loop discarding the remainder(last digit)
			sum += currentDigit // update sum
			product *= currentDigit // update product
		}
		return product - sum
	}
}